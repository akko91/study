package integer_between;

//�� ���� a, b�� �־����� �� a�� b ���̿� ���� 
//��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

//���� ����
//a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.

public class Integer_between {

	public static long solution(int a, int b) {
		long answer = 0;
		
		if(a > b) {
			for(int i = a; i>=b; i--) {
				answer = answer + i;
			}
		}
		else if ( a < b) {
			for(int i = b; i>=a; i--) {
				answer = answer + i;
			}
		}
		else if( a == b) {
			answer = a;
		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(3,6);

	}

}
