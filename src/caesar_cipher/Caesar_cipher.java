package caesar_cipher;

//� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
//���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. 
//���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

//���� ����
//������ �ƹ��� �о �����Դϴ�.
//s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
//s�� ���̴� 8000�����Դϴ�.
//n�� 1 �̻�, 25������ �ڿ����Դϴ�.


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
