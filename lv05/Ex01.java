package lv05;

public class Ex01 {
	public static void main(String[] args) {
		
		// 문자열 
		// ㄴ 문자의 나열 (배열)
		// ㄴ char[]
		
		// "apple"
		// {'a', 'p', 'p', 'l', 'e'}
		//	 0	  1	   2	3	 4	<- index 존재
		
		
		// 형 변환 Type casting
		
		// 문자 -> 숫자
		char a = 'a';
		int num = (int) a;
		System.out.println("num : " + num); // 97(askii decimal)
		
		// 숫자 -> 문자
		char b = (char) ++num;
		System.out.println("b : " + b);
		// 문자열 -> 숫자
		// ㄴ 문자열의 모든 캐릭터가 숫자여야함
		String str = "12345";
		System.out.println(str + 1);	// 123451 (문자열 확장)
		
		num = Integer.parseInt(str);
		System.out.println(num + 1);	// 12346
		// 숫자 -> 문자열
		num = 1000;
		str = String.valueOf(num);
		
		System.out.println(str + 1);	// 10001
		
		str = num + "";
	}
}
