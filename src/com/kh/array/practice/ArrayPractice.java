package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		for (int id = 0; id < iArr.length; id++) {
			System.out.print(iArr[id] + " ");
		}
	}

	public void practice2() {

		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {

			iArr[i] = 10 - i;
		}

		for (int id = 0; id < iArr.length; id++) {
			System.out.print(iArr[id] + " ");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] iArr = new int[a];

		for (int i = 0; i < iArr.length; i++) {

			iArr[i] = i + 1;

		}

		for (int k = 0; k < iArr.length; k++) {
			System.out.print(iArr[k] + " ");
		}

	}

	public void practice4() {

		String[] sArr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(sArr[1]);

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.nextLine().charAt(0);

		char strArr[] = new char[str.length()];

		boolean found = false;

		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = (str.charAt(i));

		}
		int index = 0;
		for(int i = 0; i <strArr.length; i ++) {
			if(strArr[i] == ch) {
				index += 1;
				System.out.println(str+ "에 " + ch + "가 존재하는 위치:" + i );
				System.out.println(index);
			}
		}
		
		
	}
}
