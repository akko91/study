package day1206;

import java.util.Scanner;

public class test02 {
	
	static int n = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		n = sc.nextInt();
		System.out.print(n+"�� ����� ");
		for ( int a = 1; a <= n; a++ ) {
			if( n % a == 0) {
				System.out.print(a);
				
				if( a < n) {
					System.out.print(", ");
				}
			}
			
		}
		System.out.print(" �Դϴ�.");
	}
}
