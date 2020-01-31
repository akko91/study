package supak;

//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 
//문자열을 리턴하는 함수, solution을 완성하세요. 
//예를들어 n이 4이면 수박수박을 리턴하고
//3이라면 수박수를 리턴하면 됩니다.

//제한 조건
//n은 길이 10,000이하인 자연수입니다.


public class Supak {
	public static String solution(int n) {
		String answer = "";
		String a = "수";
		String b = "박";
		
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
