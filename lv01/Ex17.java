package lv01;

import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/*
		 *  # 점수 유효성 검사
		 *  1. 점수를 입력받는다.
		 *  2. 점수가 60점 이상이면 합격, 60점 미만이면 불합격이다.
		 *  3. 단, 입력받은 정수가
		 *  	음수이거나 100점을 초과하면, "예외 메세지"를 출력한다. (예외 처리)
		 *  	예) 점수를 잘못 입력했습니다.
		 */
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 0 && score <=100) {
			if(score >= 60) {
				System.out.println("합격");
			}
			if (score < 60) {
				System.out.println("불합격");
			}
		}
		if(score < 0 || score > 100) {
			System.out.println("점수를 잘 못 입력했습니다.");
		}
		
	}

}
