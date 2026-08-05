package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=scan.nextLine();
		
		System.out.println("Enter the age");
		int age=scan.nextInt();
		
		System.out.println("Enter the Height");
		float height=scan.nextFloat();
		
		System.out.println("Are you a student");
		boolean is_student=scan.nextBoolean();
		
		System.out.println("Enter the aadhar num");
		long aadhar=scan.nextLong();
		scan.nextLine();
		
		System.out.println("Enter ur favorite teacher");
		String teacher=scan.nextLine();
		
		System.out.println("Enter your hobby");
		String hobby=scan.nextLine();
		
		
		
		
		
		

	}

}
