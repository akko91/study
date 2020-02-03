package hcf_lcm;

/*
���� ����
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������.
 �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.

���� ����
�� ���� 1�̻� 1000000������ �ڿ����Դϴ�.

*/
public class Hcf_lcm {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int a = n;
		int b = m;
		int temp = 1;
		
		if(a < b) {
			n = b;
			m = a;
		}
		
		while(temp > 0) {
			temp = n % m;
			n = m;
			m = temp;
		}
		
		answer[0] = n;
		answer[1] = a*b/n;

		
		return answer;
	}

}
