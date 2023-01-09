package com.mock.test;

public class Test {
	//9,4,-1,4,9
	public void patternPrint() {
		int firstNum=9;
		System.out.print(firstNum+" ");
		for(int i=1;i<=3;i++) {
			if(firstNum < 0) {//
				while(firstNum!=9) {
					firstNum = firstNum + 5;//-1 + 5 = 4, 4+5 = 9
					System.out.print(" "+firstNum);
				}
				return;
			}
			if(firstNum>0) {
				firstNum = firstNum - 5;//4,-1
				System.out.print(firstNum+" ");
			}
		}
	}
	public void solution2() {
		int f = 9;
		int sum = 0;
		System.out.println(f);
		while(sum!=9) {
			if(f<0) {
				while(f!=9) {
					f = f + 5;
					System.out.println(f);
				}
				return;
			}
			f = f -5;
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.patternPrint();
//		t.solution2();
	}
}
