package lv05;

import java.util.Calendar;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		// charAt
		// substring

		// 두가지 버전으로 풀이
		String jumin = "950209-1234567";
//		String jumin = "030209-2234567";
//		String jumin = "180209-3234567";
//		String jumin = "020209-4234567";
//		String jumin = "950209-5234567";
//		String jumin = "010209-6234567"; (124세)
//		String jumin = "030209-7234567";
//		String jumin = "200209-8234567";
		
		String mz = "3458";
		
		String birth = jumin.substring(0, 2);	// jumin.charAt(0) + jumin.charAt(1)
		String gender = jumin.substring(7, 8);	//jumin.charAt(7) + "" 
												//String.valueIf(jumin.charAt(7))
		
		// 문제 1) 나이 출력
		// 정답 1) 00세
		int target = Integer.parseInt(birth);
		target = mz.contains(gender) ? target + 2000 : target + 1900;
		
		System.out.println(year - target + 1);
//		int num1 = jumin.charAt(0);
//		int x = 10 * (num1 - 48);
//		char num2 = jumin.charAt(1);
//		int y = num2 - 48;
//		int num = 1900 + x + y;
//		System.out.println("나이 : " + (year - num + 1));
//
//		String num3 = jumin.substring(0, 1);
//		int i = 10 * (Integer.parseInt(num3));
//		String num4 = jumin.substring(1, 2);
//		int j = Integer.parseInt(num4);
//		int z = 1900 + i + j;
//		System.out.println("나이 : " + (year - z + 1));
//		// 문제 2) 성별 출력
//		// 정답 2) 남성
		System.out.println(Integer.parseInt(gender) % 2 == 1 ? "남" : "여");
//		char a = jumin.charAt(7);
//		if (a % 2 == 1) {
//			System.out.println("남");
//		} else {
//			System.out.println("여");
//		}
//		String b = jumin.substring(7, 8);
//		if (b.equals("1") || b.equals("3") || b.equals("5") || b.equals("7")) {
//			System.out.println("남");
//		} else {
//			System.out.println("여");
//		}
		// 1,3,5 -> 남
		// 2,4,6 -> 여
	}

}
