package even_odd;

/*
���� ����
���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
 
*/
public class Even_odd {
	public static String solution(int num) {
		String answer = "";
		
		if(num % 2 == 0) {
			answer = "Even";
		}else {
			answer = "Odd";
		}
		System.out.println(answer);
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		solution(100);

	}

}
