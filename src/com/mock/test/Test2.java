package com.mock.test;

public class Test2 {
	// Method to find second largest element
	public void findSecondLargest(int arr[]) {
		int n = arr.length;
		int max1 = arr[0];
		int max2 = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];
			}
		} // max1 = 43
		if (max1 == max2) {
			max2 = arr[1];
		}
		for (int j = 0; j < n; j++) {
			if ((arr[j] > max2) && arr[j] != max1) {
				max2 = arr[j];
			} // max2 = 10
		}

		System.out.println("largest element = " + max1);
		System.out.println("Second Largest element = " + max2);
	}

	public int mySolution(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr[n - 2];
	}

	public static void main(String[] args) {
		int arr[] = { 100, 4, 8, 9, 43 };//4 8 9 43 100
		Test2 t = new Test2();
//		t.findSecondLargest(arr);

		// Second Largest
		int secondLargest = t.mySolution(arr);
		System.out.println("Second Largest = "+secondLargest);
	}
}
