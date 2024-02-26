package test.lv01.lv02;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv 6

		// -2
		// 민수네 반 학생은 26명입니다.
		// 민수네반 학생들에게 도화지를 2장씩 나누어 주려고합니다.
		// 도화지는 10장씩 묶음으로만 판매하고 10장에 1200원입니다.
		// 총 얼마가 필요한가요?

		// -3.
		// 가게에서 24600원 짜리 옷을샀습니다.
		// 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?

		// lv 08

		// -2. 6과 8의 공약수를 모두 출력
		// 공약수란 각수의 공통인 약수를 말한다.

//		for (int i = 1; i <= 6; i++) {
//			if (6 % i == 0 && 8 % i == 0) {
//				System.out.println(i);
//			}
//		}

		// -3. 위 수의 최대 공약수 출력
		// 최대 공약수란 공약수중에서 가장큰수
//		int max = 0;
//		
//		for (int i = 1; i <= 6; i++) {
//			if (6 % i == 0 && 8 % i == 0) {
//				if (max < i) {
//					max = i;
//				}
//			}
//		}System.out.println(max);

		// lv09

		// -1. 8과 12의 최소 공배수를 구하기오
		// 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은 숫자를 말한다.
		// 예) 8 16 24...
		// 예) 12 24 ...
		// 여기서 24가 최소공배수이다.
//		int num1 = 8;
//		int num2 = 12;
//		int max = 0;
//		
//		for (int i = 1; i <= 8; i++) {
//			if (8 % i == 0 && 12 % i == 0) {
//				if (max < i) {
//					max = i;
//				}
//			}
//		}
//		int lcm = num1 * num2 / max;
//		System.out.println("최소공배수 : " + lcm);

		// -2. 수인이는 4일 마다 수영장을 가고 형주는 6일마다 수영장에간다
		// 두사람이 4월 3일에 만났다면 다음에 만날날은 언제인가?
		
//		int num1 = 4;
//		int num2 = 6;
//		int max = 0;
//		
//		for (int i = 1; i <= 4; i++) {
//			if (4 % i == 0 && 6 % i == 0) {
//				if (max < i) {
//					max = i;
//				}
//			}
//		}
//		int lcm = num1 * num2 / max;
//		System.out.println("다음에 만날날은 4월 " + (lcm + 3) + "일 입니다.");


		// -3. 가로가 12이고 세로가 8인 직사각형모양의 종이를 늘어놓아
		// 만들수있는 가장 작은 정사각형을 만들려고한다. 직사각형은 몇장이 필요한가?
		int num1 = 8;
		int num2 = 12;
		int max = 0;
		
		for (int i = 1; i <= 8; i ++) {
			if (8 % i == 0 && 6 % i == 0) {
				if (max < i) {
					max = i;
				}
			}
		}
		int lcm = num1 * num2 / max;
		int answer1 = lcm / 8;
		int answer2 = lcm / 12;
		int finalAnswer = answer1 + answer2;
		
		System.out.printf("총 %d 개의 직사각형모양의 종이가 필요합니다.", finalAnswer);
		
	}

}
