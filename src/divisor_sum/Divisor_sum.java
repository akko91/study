package divisor_sum;

//���� ����
//���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

//���� ����
//n�� 0 �̻� 3000������ �����Դϴ�.

public class Divisor_sum {

	 public static int solution(int n) {
	      int answer = 0;
	      
	      for(int i = 1 ; i <= n; i++ ) {
	    	  if( n%i == 0) {
	    		  answer += (n/i) + i;
	    	  }
	      }
	      
	      answer = answer/2;
	      
	      System.out.println(answer);
	      return answer;
	  }
	
	public static void main(String[] args) {
		solution(5);

	}

}
