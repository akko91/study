package day1206;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("������ �Է����ּ���");
	        String a = sc.nextLine();
	        System.out.println(a);
	         
	        String arr[]=a.split(" ");
	         
	        System.out.print("�󵵼��� Ȯ���� �ܾ�:");
	        String word=sc.next();
	 
	        int count=0;
	            for (int i=0; i<arr.length ;i++ )
	            {
	            if(word.equals(arr[i]))
	                {
	                count++;
	                }
	            }
	            System.out.println(word+":"+count+"��");

	}

}
