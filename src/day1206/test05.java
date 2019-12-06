package day1206;

public class test05 {

	public static void main(String[] args) {
		
		int a = 0;
		
		for(int i=1; i<=10; i++) {
			a = a + i;
		}

		
		int b = 0;
		
		int j = 1;
		while(j<=10) {
			a = a + j;
			j++;
		}
			
		System.out.println("1부터 10 까지의 합 ( for문 ) :" +a);
		System.out.println("1부터 10 까지의 합 ( while문 ) :" +b);
		
	}
}
