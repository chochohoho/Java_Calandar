package BynghoCalander;

import java.util.Scanner;

public class Sum {
	public static void main(String[] argc) {
		
		//입력 : 키볻로 두수의 입력을 받는다
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		System.out.println(" 두 수를 입력해 주세요.");
		s1 = sc.next();
		s2 = sc.next();
		
		System.out.println(s1 + ", " + s2);
		 
		a = Integer.valueOf(s1);
		b = Integer.valueOf(s2);
		
		System.out.printf("두 수의 합은 %d 입니다", a+b);
		
	}
}
