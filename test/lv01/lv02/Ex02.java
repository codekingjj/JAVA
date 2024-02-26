package test.lv01.lv02;

import java.util.Random;

//시작 : 10 : 24
//종료 : 10 : 34
//소요 : 00 : 10
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv 02 테스트

		/*
		 * 문제 2) # 랜덤학생 1. 10회 반복을 한다. 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성정) 3. 성적이 60점 이상이면
		 * 합격생이다. --------------------------------------------- .전교생(10명)의 총점과 평균을 출력한다.
		 * .합격자 수를 출력한다. .1등 학생의 번호와 성적을 출력한다.
		 */
		Random random = new Random();

		int n = 1;
		int sum = 0;
		int count = 0;
		int max = 0;
		int firstNum = 0;

		while (n <= 10) {
			int rNum = random.nextInt(100) + 1;
			sum += rNum;
			if (rNum >= 60) {
				System.out.printf("%d번 학생 합격입니다.\n", n);
				count++;
			}
			if (rNum >= max) {
				max = rNum;
				firstNum = n;
			}
			n++;
		}
		System.out.println("전교생 총점 : " + sum);
		System.out.println("전교생 평균 : " + sum / 10);
		System.out.println("합격자 수 : " + count);
		System.out.printf("1등학생의 번호와 성적 : %d, %d", firstNum, max);
	}

}
