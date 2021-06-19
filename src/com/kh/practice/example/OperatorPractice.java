package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : "음수다");

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		System.out.println((num == 0) ? "0이다" : (num > 0) ? "양수다" : "음수다");

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		System.out.println((num % 2 == 0) ? "짝수다" : "홀수다");

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 : ");
		int num1 = sc.nextInt();
		System.out.println("사탕개수 : ");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕개수 : " + num2 / num1);
		System.out.println("남는 사탕개수 : " + num2 % num1);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("학년 : ");
		int grade = sc.nextInt();
		System.out.println("반 : ");
		int ban = sc.nextInt();
		System.out.println("번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		String str = (ch == 'M' || ch == 'm') ? "남학생" : "여학생";
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double d = sc.nextDouble();

		System.out.println(grade + "학년" + ban + "반" + num + "번" + str + name + "의 성적은" + String.format("%.2f", d) + "이다");

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이: ");
		int num = sc.nextInt();
		System.out.println(num <= 13 ? "어린이" : num <19 ? "청소년" : "성인");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어: ");
		int ko = sc.nextInt();
		System.out.println("수학: ");
		int ma = sc.nextInt();
		System.out.println("영어: ");
		int en = sc.nextInt();
		
		int sum = ko + ma + en;
		double avg = sum/3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(ko>=40 && ma>=40 && en>=40 && avg >= 60.0? "합격" : "불합격");
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (-포함 ) : "  );
		char gen = sc.nextLine().charAt(8);
		System.out.println(gen=='2' ? "여자" : "남자");
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		System.out.println("입력: ");
		int num3 = sc.nextInt();
	
		System.out.println(num3<=num1 || num3> num2 ? "true" : "false");
	
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		System.out.println("정수3: ");
		int num3 = sc.nextInt();
	
		System.out.println(num1==num2 && num1 == num3 && num2 == num3 ? "true" : "false");
	
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원1: ");
		int num1 = sc.nextInt();
		System.out.println("사원2: ");
		int num2 = sc.nextInt();
		System.out.println("사원3: ");
		int num3 = sc.nextInt();
	
		System.out.println("사원1연봉 : " + (num1 + (num1*0.4)) + "원/ "+ ((num1 + (num1*04))>= 3000? "3000이상" : "3000미만"));
		System.out.println("사원2연봉 : " + num2 + "원/ "+ (num2>= 3000? "3000이상" : "3000미만"));
		System.out.println("사원3연봉 : " + (num3 + (num3*0.15)) + "원/ " + ((num3 + (num3*0.15))>= 3000? "3000이상" : "3000미만"));
	
	}
}
