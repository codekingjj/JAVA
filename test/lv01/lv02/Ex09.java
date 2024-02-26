package test.lv01.lv02;

//시작 시간 : 18 : 00
//종료 시간 : 23 : 00
//소요 시간 : 04 : 00
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lv02 테스트

		// 문제 9) 마지막!
		// -1. 8과 12의 최소 공배수를 구하기오
				// 최소 공배수란 각 수의 배수를 나열한다음 처음으로 같은 숫자를 말한다.
				// 예) 8 16 24...
				// 예) 12 24 ...
				// 여기서 24가 최소공배수이다.
//				int num1 = 8;
//				int num2 = 12;
//				int max = 0;
//				
//				for (int i = 1; i <= 8; i++) {
//					if (8 % i == 0 && 12 % i == 0) {
//						if (max < i) {
//							max = i;
//						}
//					}
//				}
//				int lcm = num1 * num2 / max;
//				System.out.println("최소공배수 : " + lcm);

				// -2. 수인이는 4일 마다 수영장을 가고 형주는 6일마다 수영장에간다
				// 두사람이 4월 3일에 만났다면 다음에 만날날은 언제인가?
				
//				int num1 = 4;
//				int num2 = 6;
//				int max = 0;
//				
//				for (int i = 1; i <= 4; i++) {
//					if (4 % i == 0 && 6 % i == 0) {
//						if (max < i) {
//							max = i;
//						}
//					}
//				}
//				int lcm = num1 * num2 / max;
//				System.out.println("다음에 만날날은 4월 " + (lcm + 3) + "일 입니다.");


				// -3. 가로가 12이고 세로가 8인 직사각형모양의 종이를 늘어놓아
				// 만들수있는 가장 작은 정사각형을 만들려고한다. 직사각형은 몇장이 필요한가?
				int num1 = 8;
				int num2 = 12;
				int max = 0;
				
				for (int i = 1; i <= 8; i ++) {
					if (8 % i == 0 && 12 % i == 0) {
						if (max < i) {
							max = i;
						}
					}
				}
				int lcm = num1 * num2 / max;
				int answer1 = lcm / 8;
				int answer2 = lcm / 12;
				int finalAnswer = answer1 * answer2;
				
				System.out.printf("총 %d 개의 직사각형모양의 종이가 필요합니다.", finalAnswer);
	}

}
