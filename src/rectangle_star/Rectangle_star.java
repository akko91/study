package rectangle_star;
/*
���� ����
�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

���� ����
n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
*/
import java.util.Scanner;

public class Rectangle_star {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        String c = "";
	        for(int i=1; i<=a; i++) {
	        	c += "*";
	        }
	        
	        for(int i=1; i<=b; i++) {
	        	 System.out.println(c);
	        }
	        
	       
	    
	}

}
