package phone;

/*
���� ����
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
*/

public class Phone {

	public static String solution(String phone_number) {
		String answer = "";
		
		int x = phone_number.length();
		
		for(int i =0; i< x-4; i++) {
			answer += "*";
		}
		for(int i= x-4; i<x; i++ ) {
			String y = phone_number.substring(i, i+1);
			answer += y;
		}
		System.out.println(answer);
		return answer;
}
	
	public static void main(String[] args) {
		solution("01012345678");

	}

}
