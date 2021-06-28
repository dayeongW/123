package com.kh.array.practice;

import java.util.Scanner;

public class DemensionPractice {
	public void practice1() {
//		int[] arr1 = new int[16];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = i+1;
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		int[][] arr2 = new int[4][4];
		int num = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%4d ", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr2 = new int[4][4];
		int num = 16;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num--;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%4d ", arr2[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		String[][] sArr = new String[3][3];
		for (int i = 0; i < sArr.length; i++) {
			for (int j = 0; j < sArr[i].length; j++) {
				sArr[i][j] = "(" + i + "," + j + ")";
			}
		}
		for (int i = 0; i < sArr.length; i++) {
			for (int j = 0; j < sArr[i].length; j++) {
				System.out.print(sArr[i][j]);
			}
			System.out.println();
		}
	}

	// 다시해보자
	public void practice4() {

//		int[] num = new int[9];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int) (Math.random() * 9 + 1);
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 9 + 1);
				arr[i][3] += arr[i][j]; // 각 행들의 합
				arr[3][j] += arr[i][j]; // 각 열들의 합
				arr[3][3] += arr[i][j]; // 총 합
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}

	}

	// 다시!!
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		char[][] arr;
		System.out.println("행 : ");
		int row = sc.nextInt();
		System.out.println("열 : ");
		int col = sc.nextInt();

		if ((row <= 10 && row >= 1) && (col <= 10 && col >= 1)) {
			arr = new char[row][col];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (Math.random() * 26 + 65);
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("1~10 사이의 수로 다시 입력하세요.");
			practice5();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	// 다시!!!!!!!!!!!!
	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.println("행 : ");
		int num = sc.nextInt();
		char[][] arr = new char[num][];
		char letter = 'a';

		for (int i = 0; i < num; i++) {
			System.out.println(i + "행크기 : ");
			int num2 = sc.nextInt();
			arr[i] = new char[num2];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = letter;
				letter++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] cl = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] clSeat = new String[3][2];
		int index = 0;

		while (true) {
			for (int i = 0; i < clSeat.length - 1; i++) {
				System.out.println("=== " + (i + 1) + "분단 ===");

				for (int j = 0; j < clSeat.length; j++) {

					for (int k = 0; k < clSeat[j].length; k++) {
						clSeat[j][k] = cl[index++];
					}
				}
				for (int l = 0; l < clSeat.length; l++) {
					for (int m = 0; m < clSeat[l].length; m++) {
						System.out.printf("%2s   ", clSeat[l][m]);
					}
					System.out.println();
				}
			}
			break;
		}
	}

}
