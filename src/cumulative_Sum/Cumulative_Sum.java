package cumulative_Sum;

import java.util.Scanner;

//사용자 한테 N을 입력받아 
//1에서 까지의 합을 누적하여 출력하는 프로그램을 
//참고자료 없이 상태로 연습합니다.

public class Cumulative_Sum {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 => ");
		int n = sc.nextInt();

		for (int a = 1; a <= n; a++) {
			sum = sum + a;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum);
	}
}
