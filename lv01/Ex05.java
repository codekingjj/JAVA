package lv01;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10%제외)
		System.out.println((100 * 0.9) * 12 + "원");
		// 문제2) 시험점수를 30, 50, 4점을 받았다. 평균은?
		System.out.println((30 + 50 + 4) /3 +"점");
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println(3 * 6 / 2);
		// 문제4) 100초를 1분 40초로 출력
		System.out.println((100 / 60) +"분" + (100 % 60) +"초");
		// 문제5) 800원에서 500원짜리 개수 , 800에서 500원을 뺸 100원짜리개수 출력
		System.out.println("500원(" + (800 / 500) + "개)," + " 100원(" + (800 % 500) / 100 + "개)");
	}

}
