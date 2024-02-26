package test.lv01;
//시작시간 : 03:55
//종료시간 : 04:13
//소요시간 : 00:18

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 6)
		/*
		 * 시험점수 3개를 입력받고 학점 출력 조건 1) 3과목의 평균을 가지고 점수를 매긴다. 조건 2) 3과목의 평균이 100~90 ==> A
		 * 조건 3) 3과목의 평균이 89~80 ==> B 조건 4) 3과목의 평균이 79~70 ==> C 조건 5) 69이하 ==재시험 추가조건)
		 * 각점수대별로 끝자리가 7점 이상은 +가 붙는다. 예) 98 ==> A+ 예) 89 ==> B+
		 */

		Scanner scan = new Scanner(System.in);
		int math = 0;
		int eng = 0;
		int kor = 0;

		System.out.println("세개의 과목의 점수를 입력하시오.");
		System.out.println("수학 : ");
		math = scan.nextInt();
		System.out.println("영어 : ");
		eng = scan.nextInt();
		System.out.println("국어 : ");
		kor = scan.nextInt();

		int avg = (math + eng + kor) / 3;
		System.out.println("평균점수 : " + avg);
		if (avg >= 90 && avg <= 100) {
			if (avg == 97 || avg == 98 || avg == 99 || avg == 100) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}

		} else if (avg >= 80 && avg <= 89) {
			if (avg == 87 || avg == 88 || avg == 89) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (avg >= 70 && avg <= 79) {
			if (avg == 77 || avg == 78 || avg == 79) {
				System.out.println("C+");
			} else {
				System.out.println("C");
			}
		} else {
			System.out.println("재시험을 봐야합니다.");
		}

	}

}
