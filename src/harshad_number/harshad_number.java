package harshad_number;

/*
���� ����
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� 1 �̻�, 10000 ������ �����Դϴ�.
*/
public class harshad_number {
	public static boolean solution(int x) {
		boolean answer = true;		
		String a = Integer.toString(x);
		int y = 0;

		for(int i=0; i< a.length(); i++) {
			String b = a.substring(i,i+1);
			y += Integer.parseInt(b);
		}
		if(x%y == 0) {
			answer = true;
		}
		else{
			answer = false;
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		solution(13);

	}

}
