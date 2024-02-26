package lv04;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 비교
		
		//1) A.eauals(B)
		// ㄴ 문자열의 일치여부를 boolean 으로 변환
		
		String str1 = "이재정";
		String str2 = "홍길동";
		
		System.out.println(str1.equals(str2));
		
		//2) A.compareTo(B)
		// ㄴ 문자열의 순서를 비교하여, "무엇을" 정수로 반환
		// ㄴ A문자열이 B문자열과 비교했을 때, 문자열 시퀀스의 위치를 정수로 반환
		//	음수	: A앞에 있다.
		//	0	: 같다.
		//	양수	: 뒤에 있다.
		
		String str3 = "a";
		String str4 = "b";
		String str5 = "b";
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		System.out.println(str4.compareTo(str5));
	}

}
