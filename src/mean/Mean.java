package mean;

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

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
