package Ch10ClassBasic;

import java.util.Scanner;


	
	
public class C05Prac {
	

	public static void main(String[] args) {
		//String 클래스로 문자열을 하나 입력받습니다
		//입력받은 문자열의 길이 출력
		//문자열의 idx중에 2,3,4,만 출력
		//다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어 있는지 여부 확인
		//저장된 문자열의 길이를 확인해서,특정 문자열 위치 idx 확인후 확인된 idx위치에서 마지막 idx까지 잘라내기
		Scanner sc=new Scanner(System.in);
		String K=sc.nextLine();
		System.out.println(K.length());
		System.out.println(K.charAt(2));
		System.out.println(K.charAt(3));
		System.out.println(K.charAt(4));
		
		String K2=sc.nextLine();
		System.out.println(K.contains(K2));
		
	}

}
