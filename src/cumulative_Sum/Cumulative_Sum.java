package cumulative_Sum;

import java.util.Scanner;

//����� ���� N�� �Է¹޾� 
//1���� ������ ���� �����Ͽ� ����ϴ� ���α׷��� 
//�����ڷ� ���� ���·� �����մϴ�.

public class Cumulative_Sum {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� => ");
		int n = sc.nextInt();

		for (int a = 1; a <= n; a++) {
			sum = sum + a;
		}

		System.out.println("1���� " + n + "������ ���� " + sum);
	}
}
