package lv01;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문
		// if(조건식) {실행문;}
		// 자동 정렬 : ctrl + shift + f

		// if(true) {
		// System.out.println("hello~");
		// }

		// 문제 1) 양수 , 0 , 음수 출력
		int num1 = -10;
		if (num1 > 0) {
			System.out.println("양수");
		}
		if (num1 == 0) {
			System.out.println("0");
		}
		if (num1 < 0) {
			System.out.println("음수");
		}
		// 문제 2) 4의 배수 여부 출력
		int num2 = 12;
		if (num2 % 4 == 0) {
			System.out.println(true);
		}
		if (num2 % 4 != 0) {
			System.out.println(false);
		}
		// 문제 3) 합격, 불합격 출력
		int num3 = 87;
		if (num3 > 60) {
			System.out.println("합격");
		}
		if (num3 < 60) {
			System.out.println("불합격");
		}
	}

}
