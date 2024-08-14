/*
 * print the character user entered index in the String.
 */
package com;

import java.util.Scanner;

public class IndexCharacterPrinter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string:");
		String st=s.nextLine();
		System.out.print("Enter the index:");
		int k=s.nextInt();
		
		if(k<st.length()) {
			System.out.println(st.charAt(k));
		}else {
			System.out.println("Enter valid index");
		}
	}

}
