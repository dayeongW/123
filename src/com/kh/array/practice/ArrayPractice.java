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

	// 다시해봐야함
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열입력 : ");
		String str = sc.nextLine();
		System.out.println("문자입력 : ");
		char ch = sc.nextLine().charAt(0);

		// 사용자가 입력한 문자열의 길이만큼 char배열 할당
		char[] arr = new char[str.length()];

		// 반복문을 통해 str.charAt(i)값을 arr[i]에 담기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// 검색할 문자가 어느 인덱스에 있는지 ? 몇개 있는지?
		// 검색할 문자의 갯수를 카운트 할 변수
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // 같은문자를 찾으면
				System.out.print(" 인덱스" + i); // 인덱스번호 출력하고
				cnt++; // 카운트 1증가
			}

		}
		System.out.println(); // 개행한번해주고
		System.out.println(ch + "문자 갯수 : " + cnt + "개"); // 갯수출력
	}

	public void practice6() {
		String[] sArr = { "월", "화", "수", "목", "금", "토", "일" };

		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			for (int i = 0; i < sArr.length; i++) {
			}
			System.out.println(sArr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수: ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println();
		System.out.println("총합 : " + sum);
	}

	// 다시해봐야함
	public void practice8() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수: ");
			int num = sc.nextInt();
			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				int count = 1;
				for (int i = 0; i < arr.length; i++) {
					arr[i] = count;
					if (i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}

				}
				break;

			} else {
				System.out.println("다시입력하세요.");
			}

		}

	}

	// 다시해봐야함
	public void practice9() {
		String[] sArr = { "양념", "불닭", "반반", "후라이드" };
		Scanner sc = new Scanner(System.in);

		System.out.println("치킨이름: ");
		String str = sc.nextLine();

		// 동일한 메뉴가 있는지 없는지 논리값을 받아주기 위한 변수 사용
		boolean flag = false;

		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals(str)) {
				flag = true; // 있으면 true로 변경
				break; // 반복문 빠져나가기

			}

		}
		if (flag) { // flag true일 경우
			System.out.println(str + "치킨 배달가능");
		} else {
			System.out.println(str + "치킨은 없는 메뉴임");
		}
	}

	// 다시해봐야함
	public void practice10() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice11() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 오름차순으로 정렬해 놓고
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		} // 최소값과 최대값 구하기!
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[9]);
	}

	// 다시해봐야함
	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 같으면 인덱스를 증가시키지 않고 반복문을 빠져나가서 다시 넣는다
					break;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];

		// 반복문을 통해 str.charAt(i)값을 arr[i]에 담기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		for(int i = 0; i < arr.length; i++) {
			if(i<8) {
				System.out.print(arr[i]);
			}else{
				arr[i]='*';
				System.out.print(arr[i]);
			}
		}
	}
	
	// 다시해보기
	public void practice14() {
		int[]arr = new int[6];
		// 배열에 중복값없이 1~45까지 난수 초기화
		for(int i = 0; i <arr.length; i ++) { 
			arr[i]= (int)(Math.random()*45+1);
			for(int j = 0; j < i; j ++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순
		for(int i = 0; i <arr.length; i ++) {// 비교주체
			for(int j = i+1; j<arr.length; j ++) {// 비교대상(arr[i] 다음번)
				if(arr[i]>arr[j]) { // 비교주체가 비교대상보다 큰 경우 뒤로 갈 수 있도록 자리 교체
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		// 출력
		}for(int i = 0; i <arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
	
	}
}
