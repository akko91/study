package num_reverse;

import java.util.Arrays;

/*
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. 
������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
*/

public class Num_reverse {
	public static int[] solution(long n) {
		int length = String.valueOf(n).length();
		int[] answer = new int[length];
		
		for(int i=0; i<length; i++) {
			answer[i]= (int) (n%10);
			n = n/10;
		}

		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(12345)));
	}

}
