package lv04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 문자열 비교
		// == 사용X(주소비교)
		// equals() 메소드 사용 O
		
		// Java : String Constant Pool(Heap)
		
		String str1 = "이재정";
		String str2 = "이재정";
		String str3 = scan.next();
		String str4 = new String("이재정");
		
		System.out.println(str1 == str2);	//true;
		System.out.println((str2 == str3));
		System.out.println((str2 == str4));
		System.out.println((str3 == str4));
		
		// 고유 ID 조회
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		// 문자열의 각 캐릭터(문자 한개씩) 를 비교해주는
		// 기 구현된 메소드인 equals를 써서
		// 문자열의 비교를 정확히 할 수 있다.
		
	}
}
