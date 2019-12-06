package day1206;

import java.util.Scanner;

public class test02 {
	
	static int n = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		n = sc.nextInt();
		System.out.print(n+"의 약수는 ");
		for ( int a = 1; a <= n; a++ ) {
			if( n % a == 0) {
				System.out.print(a);
				
				if( a < n) {
					System.out.print(", ");
				}
			}
			
		}
		System.out.print(" 입니다.");
	}
}
