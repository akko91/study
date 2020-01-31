package caesar_cipher;

//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
//예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 
//문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

//제한 조건
//공백은 아무리 밀어도 공백입니다.
//s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//s의 길이는 8000이하입니다.
//n은 1 이상, 25이하인 자연수입니다.


public class Caesar_cipher {
	public static String solution(String s, int n) {
		String answer = "";
		
		for(int i =0; i<s.length(); i++) {
			
			char temp = s.charAt(i);
			
			if( temp != ' ') {				
				temp = (char)(temp + n);
			}
			if( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && temp > 'Z') {
				temp = (char) (temp-26); 
			}
			else if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && temp > 'z') {
				temp = (char) (temp-26); 
			}
			answer += temp;
		}
		System.out.println(answer);
		
		return answer;
		
//		String answer = "";
//		Character[] arr = new Character[s.length()];
//		Character[] arr2 = new Character[s.length()];
//		
//		for(int i = 0; i < s.length(); i++) {
//			Character a = s.charAt(i);
//			arr[i] = a;
//		}
//		
//		
//		for(int i =0; i<arr.length; i++) {
//			if( arr[i] != ' ') {				
//				arr2[i] = (char)(arr[i] + n);
//			}
//			if( arr[i] >= 'A' && arr[i] <= 'Z' && arr2[i] > 'Z') {
//				arr2[i] = (char) (arr2[i]-26); 
//			}
//			else if( arr[i] >= 'a' && arr[i] <= 'z' && arr2[i] > 'z') {
//				arr2[i] = (char) (arr2[i]-26); 
//			}
//			answer += arr2[i];
//		}
//		System.out.println(answer);
//		
//		return answer;
		
	}
	
	
	public static void main(String[] args) {
		
		solution("abz",1);
	}

}
