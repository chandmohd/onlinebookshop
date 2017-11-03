package com.emids.utility;

import java.util.Scanner;

public class ScannerClass {
	private ScannerClass() {

	}

	public static String inOut() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
