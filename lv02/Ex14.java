package lv02;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */
		
		Random random = new Random();
		int n = 1;
		int sum = 0;
		int count = 0;
		int max = 0;
		int topNum = 0;
		while (n <= 10) {
			int score = random.nextInt(100) + 1;
			if (score >= 60) {
				System.out.printf("%d번 학생 합격입니다~!\n", n);
				count ++;
			}
			// 총점
			sum += score;
			//max(최대값), n(학생번호)
			if (max < score) {
				topNum = n;
				max = score;
			}
			n++;
		}
		int avg = sum / 10;
		// 총점, 평균
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("합격자수 : " + count);
		System.out.printf("1등학생의 번호 : %d, 1등의 성적 : %d", topNum, max);
		//합격자 수
	}

}
