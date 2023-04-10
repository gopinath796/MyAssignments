package org.system;

public class Desktop extends Computer {

	public void desktopsize() {
		System.out.println("21 inch Flat screen");
	}

	public static void main(String[] args) {
		Desktop inheri = new Desktop();
		inheri.computerModel();
		inheri.desktopsize();

	}

}
