package day1206;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("'+','-','*''/'중에 하나 입력");
		String i = sc.next();
		System.out.print("첫번째 숫자 입력 =>");
		int a = sc.nextInt();
		System.out.println(" ");
		System.out.print("두번째 숫자 입력 =>");
		int b = sc.nextInt();
		System.out.println(" ");
		
		if( i.equals("+")) {
			System.out.println(a+b);
		}
		if( i.equals("-")) {
			System.out.println(a-b);
		}
		if( i.equals("*")) {
			System.out.println(a*b);
		}
		if( i.equals("/")) {
			System.out.println(a/b);
		}
		
	}
}