package mean;

//������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

//���ѻ���
//arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
//arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.

public class Mean {
	
	public static double solution(int[] arr) {
		double answer = 0;
		
		for(int i=0; i < arr.length;i++) {
			answer = answer + arr[i];	  
		}
		answer = answer/ arr.length;
		System.out.println(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6};
		solution(arr);
	}

}
