package palindromeNumber;

//대칭되는 숫자일경우 true 반환
//ex) 12321 = true 
//    12312 = false



public class Palindrome_Number {
	public static boolean isPalindrome(int x) {
		boolean re = true;

		if (x < 0) {
			re = false;
		} 
		
		else {

			try {
			int length = Math.abs((int) (Math.log10(x) + 1));
			int l = length;
			int n = length / 2;
			int[] a = new int[length];
			
			for (int i = 0; i <= length - 1; i++) {
				int num = x % 10;
				a[i] = num;
				x = (x - num) / 10;
			}

			for (int i = 0; i < n; i++) {
				l = l - 1;
				if (a[i] != a[l]) {
					re = false;
					break;
				}

			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

		System.out.println(re);
		return re;
	}

	public static void main(String[] args) {
		isPalindrome(12321);

	}

}
