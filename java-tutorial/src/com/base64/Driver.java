package com.base64;

import java.util.Base64;

public class Driver {

	public static void main(String[] args) {
		
		//email":"dGdyQGdtYWlsLmNvbQ==","orgId":"QVhC","
		String msg = "tgr@gmail.com";
		Base64.Encoder enc = Base64.getEncoder();
		byte[] encbytes = enc.encode(msg.getBytes());
		for (int i = 0; i < encbytes.length; i++) {
			System.out.printf("%c", (char) encbytes[i]);
			if (i != 0 && i % 4 == 0)
				System.out.print(' ');
		}
		System.out.println();
		byte[] enc2="QVhC".getBytes();
		Base64.Decoder dec = Base64.getDecoder();
		byte[] decbytes = dec.decode(enc2);
		System.out.println(new String(decbytes));
	}
}
