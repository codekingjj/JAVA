package lv01;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 지하철 요금 계산 1. 이용할 정거장 수를 입력받는다. 2. 다음과 같이 정거장 수에 따라 요금이 정산된다. 3. 요금표 1) 1~5
		 * : 500원 2) 6~10 : 600원 3) 11,12 : 650원(10정거장이후에는 2정거장마다 50원 추가) 4) 13,14 :
		 * 700원 5) 15,16 : 750원 ...
		 */
		Scanner scan = new Scanner(System.in);
		int cost1 = 500;
		int cost2 = 600;
		int extra = 0;

		System.out.println("이용할 정거장 수를 입력해 주세요 : ");
		int sum = scan.nextInt();
		
		// 요금 출력
		// ㄴ print()
		// ㄴ printf()
		// ㄴ printf("포맷문자열", 맵핑될값1, 맵핑될값2 ...)
		
		// 서식 문자
		// %d 정수 (decimal)
		// %f 실수(float)
		// %c 문자 한 개 (character)
		// %s 문자열 (string)
		// %b 참거짓 (boolean)

		if (1 <= sum && sum <= 5) {
			//System.out.println(cost1 + "원 입니다.");
			System.out.printf("요금 : %d원 입니다.", cost1);
		} else if (6 <= sum && sum <= 10) {
			System.out.println(cost2 + "원입니다.");
		} else if (sum >= 11) {
			extra = (sum - 10 + 1) / 2 * 50;
			System.out.println(cost2 + extra + "원입니다.");
		}

	}

}
