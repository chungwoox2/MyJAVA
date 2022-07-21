package Ch10ClassBasic;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {
		//String str1 =new String("Java IS ");
		//String str2 =new String("Powerful");
		//String str3 = str1+str2;
		
		//System.out.println(str3);
		
		//System.out.println("길이 :"+str1.length());
	//	System.out.println("단일문자 찾기 :"+str1.charAt(0));
		//System.out.println("문자열 idx검색 :"+str1.indexOf("v"));
		//System.out.println("문자열 자르기 :"+str1.substring(0,4));
		//System.out.println("포함문자열 검색 :"+str1.contains("va"));
		//System.out.println("문자열 교체하기 :"+str1.replace('a', 'A'));
		
		//단일 한문자 받기 연습
		
		Scanner sc =new Scanner(System.in);
		char tmp =sc.next().charAt(0);
		
		System.out.println("단일문자 확인 :" +tmp);
	}

}
