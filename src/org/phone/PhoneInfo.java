package org.phone;

public class PhoneInfo {
	// method creation
	private void phoneName() {
//business logics
		System.out.println("REDMI");
	}

	private void phoneIMEI() {
		System.out.println("123456789");

	}

	private void phoneStorage() {
		System.out.println("128GB");
	}

	private void phoneCamera() {
		System.out.println("64MP");
	}

	private void osName() {
		System.out.println("OREO");
	}

//main method 
	public static void main(String[] arg) {
		// object creation
		PhoneInfo a = new PhoneInfo();
		a.phoneName();
		a.phoneIMEI();
		a.phoneStorage();
		a.phoneCamera();
		a.osName();
	}
}