package day1206;

import java.util.Scanner;

/*����� ���� ���� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, ����� �߸��� ���� �Է¹޾� ����� �� ���� �Է��Ҷ� ���� �ݺ� �����ϵ��� �մϴ�.
*/


public class test04 {
	static int month = 0;
	static String i = "N";
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while( true ) {
			System.out.print("���� �Է��ϼ��� => ");
			month = sc.nextInt();
			
			if( 3 <= month && month <= 5) {
				System.out.println("��");	
				re();
			}
			else if( 6 <= month && month <= 8) {
				System.out.println("����");
				re();
			}
			else if( 9 <= month && month <= 11) {
				System.out.println("����");
				re();
			}
			else if( month == 12 || month == 1 || month == 2 ) {
				System.out.println("�ܿ�");
				re();
			}
			else {
				
			}
		}

	}
	
	public static void re() {
		while( true ){
			System.out.print("�ٽ� �Ͻðڽ��ϱ�?(Y/N)");
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

