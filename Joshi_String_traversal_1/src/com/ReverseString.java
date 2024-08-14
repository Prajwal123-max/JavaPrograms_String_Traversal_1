package com;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		reverseString(st);
	}
	public static void reverseString(String st) {
		String t="";
		for(int i=st.length()-1; i>=0; i--) {
			char ch=st.charAt(i);
			t=t+ch;
		}
		System.out.println("Reversed String: "+t);
	}

}
