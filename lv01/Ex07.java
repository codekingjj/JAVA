package lv01;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
			int wage = 100;
			double tax = 0.9;
			System.out.println("연봉 = " + wage * tax * 12);
		
		// 문제2) 시험점수를 30, 50, 4점을 받았다. 평균은?
			int gradeA = 30;
			int gradeB = 50;
			int gradeC = 4;
			int avg = (gradeA + gradeB + gradeC) / 3;
			System.out.println("평균 = " + avg);
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
			int height = 6;
			int width = 3;
			int area = height * width / 2;
			System.out.println("넓이 = " + area);
		// 문제4) 100초를 1분 40초로 출력
			int question = 100;
			int minute = question / 60;
			int second = question % 60;
			System.out.println("시간 = " + minute + "분 " + second + "초");
		
		// 문제5) 800원에서 500원짜리 개수, 100원짜리 개수
			int money = 800;
			int changeFivehundred = money / 500;
			int changeOnehundred = money % 500 / 100;
			System.out.println("500원(" + changeFivehundred + "개), " + "100원(" + changeOnehundred + "개)");
	}

}
