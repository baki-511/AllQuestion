package com.mock.test2;

public class SampleTest{
	public int checkMiddleElement(int[] arr) {
		int n=arr.length;
		int i=0,j=n-1;
		int k=1;
		while((i<k) || (j>k)) {
			if((arr[i]>arr[k])||(arr[j]<arr[k])) {
				k++;
				i=0;
				j=n-1;
			}
			if(i<k) {
				i++;
			}
			if(j>k) {
				j--;
			}
			if((i>=k)&&(j<=k)) {
				return k;
			}
			
		}
		return -1;
	}
	public void printArr(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SampleTest st = new SampleTest();
		int arr[] = {5, 1, 4, 3, 6, 8, 10,2, 7, 9} ;
		if(st.checkMiddleElement(arr)!= -1) {
			System.out.println(st.checkMiddleElement(arr));
		}
		else {
			System.out.println("Such element not Exist");
		}
	}
}