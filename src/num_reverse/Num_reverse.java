package num_reverse;

import java.util.Arrays;

/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
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
