package day1206;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("'+','-','*''/'�߿� �ϳ� �Է�");
		String i = sc.next();
		System.out.print("ù��° ���� �Է� =>");
		int a = sc.nextInt();
		System.out.println(" ");
		System.out.print("�ι�° ���� �Է� =>");
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