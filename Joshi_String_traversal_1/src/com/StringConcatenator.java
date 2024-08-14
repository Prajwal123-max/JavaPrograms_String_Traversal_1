/*
 * Concatenate two String and print that String.
 */
package com;

import java.util.Scanner;

public class StringConcatenator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String1:");
		String st1=s.nextLine();
		System.out.print("Enter the String2:");
		String st2=s.nextLine();
		
		String res=st1+st2;
		System.out.println(res);
	}

}
