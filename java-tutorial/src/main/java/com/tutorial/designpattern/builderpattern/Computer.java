package com.tutorial.designpattern.builderpattern;

public class Computer {

	// compulsary attributes
	private String hdd;
	private String ram;

	// optionalAttributes
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public Computer(ComputerBuilder computerBuilder) {
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;

	}

	public static class ComputerBuilder {
		// compulsary attributes
		private String hdd;
		private String ram;

		// optionalAttributes
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {

			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

}