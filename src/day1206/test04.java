package day1206;

import java.util.Scanner;

/*사용자 한테 월을 입력받아 계절명을 출력하는 프로그램을 작성하시오. 
단, 사용자 잘못된 값을 입력받아 제대로 된 값을 입력할때 까지 반복 수행하도록 합니다.
*/


public class test04 {
	static int month = 0;
	static String i = "N";
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while( true ) {
			System.out.print("월을 입력하세요 => ");
			month = sc.nextInt();
			
			if( 3 <= month && month <= 5) {
				System.out.println("봄");	
				re();
			}
			else if( 6 <= month && month <= 8) {
				System.out.println("여름");
				re();
			}
			else if( 9 <= month && month <= 11) {
				System.out.println("가을");
				re();
			}
			else if( month == 12 || month == 1 || month == 2 ) {
				System.out.println("겨울");
				re();
			}
			else {
				
			}
		}

	}
	
	public static void re() {
		while( true ){
			System.out.print("다시 하시겠습니까?(Y/N)");
			i = sc.next();
			if( i.equals("N") || i.equals("n") ) {
				return;
			}
			else if ( i.equals("Y") || i.equals("y") ) {
				break;
			}
			else {
				
			}
		}
	}
}

