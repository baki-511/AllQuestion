package com.mock.test2;

import java.util.Scanner;
public class Demo {
	//Solution 1
		public void checkPalindrome(String s) {// 
			int len= s.length();
			int i=0,j=len-1;
			
			while(i<j) {
				if(s.charAt(i)!= s.charAt(j)) {
					System.out.println("this strng is not palindrom");
					return;
				}
				i++;
				j--;
			}
			System.out.println("this string is palindrome");
		}
		//Solution 2
		public void checkPalindrome2(String s) {
			int len = s.length()-1;
			String str = "";
			for(int i=len;i>=0;i--) {
				str = str + s.charAt(i);
			}
			for(int j=0;j<=len;j++) {
				if(str.charAt(j)!= s.charAt(j)) {
					System.out.println("Not palindrome");
					return;
				}
			}
			System.out.println("Palindrome.");
		}
//		Solution 3
		public void checkPalindrome3(String s) {
			int len = s.length();
			for(int i=0,j=len-1;i<=len/2;i++,j--) {
				if(s.charAt(i)!= s.charAt(j)) {
					System.out.println("Not Palindrome.");
					return;
				}
			}
			System.out.println("Palindrome.");
		}
}
