package BynghoCalander;

import java.util.Scanner;

public class Calander {

	public static void main(String[] argc) {

		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// 숫자를 입력 받아 최대 일수를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 달을 입력 하세요");
		int nmonth = sc.nextInt();
		
		int[] nMaxdays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
		
		System.out.printf("%d월은 %d일 까지 있습니다.", nmonth,nMaxdays[nmonth-1]);
	}
}
