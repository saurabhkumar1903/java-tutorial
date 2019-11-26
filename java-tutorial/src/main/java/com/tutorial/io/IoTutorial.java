package com.tutorial.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IoTutorial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8252232250380309607L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		byteAndCharacterTesting();
//		byteOrientedFileReadAndWrite();
//		characterOrientedFileReadAndWrite();
//		listAllFilesInDirectory("src");
//		characterOrientedFileReadAndWrite();
//		consoleReadWrite();
//		ObjectReadAndWrite();
//		readFileThroughChannel();
//		readFileThroughChannelByMappingFileToBuffer();
		writeFileThroughChannel();

	}

	private static void writeFileThroughChannel() throws IOException {
		final SeekableByteChannel seekableByteChannel = Files.newByteChannel(Paths.get("toWrite.txt"),
				StandardOpenOption.WRITE,StandardOpenOption.CREATE);
		final String toWrite = "This line is supposed to be written to file to overwrite the existing contents.";
		final ByteBuffer byteBuffer = ByteBuffer.wrap(toWrite.getBytes());
		byteBuffer.rewind();
		seekableByteChannel.write(byteBuffer);

	}

	private static void readFileThroughChannelByMappingFileToBuffer() throws IOException {

		final FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("toRead.txt"),
				StandardOpenOption.READ);
		final MappedByteBuffer mappedByteBuffer = fileChannel.map(MapMode.READ_ONLY, 0, fileChannel.size());

		for (int i = 0; i < fileChannel.size(); i++) {
			System.out.print((char) mappedByteBuffer.get(i));
		}
	}

	private static void readFileThroughChannel() throws IOException {
		final Path path = Paths.get("toRead.txt");
		final SeekableByteChannel seekableByteChannel = Files.newByteChannel(path);
		final ByteBuffer byteBuffer = ByteBuffer.allocate(128);
		byteBuffer.mark();
		int count = 0;
		while (-1 != (count = seekableByteChannel.read(byteBuffer))) {

			byteBuffer.reset();
			for (int i = 0; i < count; i++) {
				System.out.print((char) byteBuffer.get(i));
			}

		}
		seekableByteChannel.close();
		byteBuffer.clear();
	}

	private static void ObjectReadAndWrite() throws FileNotFoundException, IOException, ClassNotFoundException {

		final IoTutorial ioTutorial = new IoTutorial();
		final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.out"));
		objectOutputStream.writeObject(ioTutorial);
		// objectOutputStream.flush();

		final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.out"));
		final IoTutorial ioTutorial2 = (IoTutorial) objectInputStream.readObject();
		final PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.print("io1:" + ioTutorial.hashCode());
		printWriter.print("io2:" + ioTutorial2.hashCode());
		printWriter.print('\n');
		printWriter.flush();

	}

	private static void consoleReadWrite() {

		final Console console = System.console();
		if (null == console) {
			return;
		}
		final String input = console.readLine("Enter something ");
		console.writer().print("hello console");

	}

	private static void byteAndCharacterTesting() {
		// BufferedReader is final character oriented
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// byte oriented console write
		System.out.write(65);
		System.out.write('\n');
		System.out.write('c');
		System.out.write('\n');
		System.out.flush();

		// character oriented console write final PrintWriter printWriter=new
		final PrintWriter printWriter = new PrintWriter(System.out, true);
		printWriter.printf("raj is a  %s boy", "bad");
	}

	private static void characterOrientedFileReadAndWrite() throws IOException {
		final FileReader fileReader = new FileReader("toRead.txt");
		final BufferedReader br = new BufferedReader(fileReader);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		final FileWriter fileWriter = new FileWriter("toWrite.txt");
		fileWriter.write("hello world");
		fileWriter.flush();

	}

	private static void byteOrientedFileReadAndWrite() throws IOException {

		// byte oriented file reading method 1
		final FileInputStream fin = new FileInputStream("toRead.txt");
		final FileOutputStream fileOutputStream = new FileOutputStream("toWrite.txt");
		int c;
		while ((c = fin.read()) != -1) {
			System.out.write(c);
			fileOutputStream.write(c);

		}

		// byte oriented file reading method 2
		final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("hello".getBytes());
		while ((c = byteArrayInputStream.read()) != -1) {
			System.out.write(c);
		}
		System.out.write('\n');

	}

	private static void listAllFilesInDirectory(String path) {

		final File file = new File(path);
		if (!file.exists()) {
			System.out.println("Path does not exists");
			return;
		}
		if (file.isDirectory()) {
			for (final File files : file.listFiles())

			{
				listAllFilesInDirectory(files.getAbsolutePath());
			}

		} else {
			System.out.println(file.getName());
		}

	}

	private static boolean checkFileName(File currentFile) {
		return currentFile.getName().contains("Driver");
	}

}
