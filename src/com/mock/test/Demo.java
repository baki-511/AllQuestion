package com.mock.test;

public class Demo {
	public void reverseNum(int[] arr) {
		int n = arr.length;
		int temp[] = new int[n];
		int k=0;
		for(int i=n-1;i>=0;i--) {
			temp[k] = arr[i];
			k++;
		}
		System.out.println("Temporary Array :- ");
		printArr(temp);
	}
	public void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] arr = {1,45,32,8,9};
		Demo d = new Demo();
		
		d.printArr(arr);
		d.reverseNum(arr);
	}

}
