package supak;

//���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� 
//���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//������� n�� 4�̸� ���ڼ����� �����ϰ�
//3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

//���� ����
//n�� ���� 10,000������ �ڿ����Դϴ�.


public class Supak {
	public static String solution(int n) {
		String answer = "";
		String a = "��";
		String b = "��";
		
		for(int i = 1; i <= n; i++) {
			if(i%2 == 1) {
				answer = answer+a;
			}
			if(i%2 == 0) {
				answer = answer+b;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(5);
	}

}
