package day1206;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("문장을 입력해주세요");
	        String a = sc.nextLine();
	        System.out.println(a);
	         
	        String arr[]=a.split(" ");
	         
	        System.out.print("빈도수를 확인할 단어:");
	        String word=sc.next();
	 
	        int count=0;
	            for (int i=0; i<arr.length ;i++ )
	            {
	            if(word.equals(arr[i]))
	                {
	                count++;
	                }
	            }
	            System.out.println(word+":"+count+"번");

	}

}
