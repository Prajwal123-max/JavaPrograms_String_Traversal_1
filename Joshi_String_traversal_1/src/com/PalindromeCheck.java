package com;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string:");
		String st=s.nextLine();
		
		String res=isPalindrome(st);
		System.out.println(res);
	}
	public static String isPalindrome(String st) {
		int i=0;
		int j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)==st.charAt(j)) {
				i++;
				j--;
			}else {
				return "No";
			}
		}
		return "Yes";
	}

}
