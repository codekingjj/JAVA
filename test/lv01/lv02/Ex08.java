package test.lv01.lv02;

//시작 시간 : 20 : 10
//종료 시간 : 23 : 30
//소요 시간 : 03 : 20
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 8)
		// -1 7의 배수를 차례대로 출력했을때 8번째 배수를 출력
//		for (int i = 1; true; i++) {
//			if (i == 8) {
//				System.out.println(i * 7);
//				break;
//			}
//		}

		// -2. 6과 8의 공약수를 모두 출력
				// 공약수란 각수의 공통인 약수를 말한다.

//				for (int i = 1; i <= 6; i++) {
//					if (6 % i == 0 && 8 % i == 0) {
//						System.out.println(i);
//					}
//				}

				// -3. 위 수의 최대 공약수 출력
				// 최대 공약수란 공약수중에서 가장큰수
//				int max = 0;
//				
//				for (int i = 1; i <= 6; i++) {
//					if (6 % i == 0 && 8 % i == 0) {
//						if (max < i) {
//							max = i;
//						}
//					}
//				}System.out.println(max);

		// -4 25, 75 의 최대 공약수를 출력
//		int max = 0;
//		
//		for (int i = 1; i <= 25; i++) {
//			if (25 % i == 0 && 75 % i == 0) {
//				if (max < i) {
//					max = i;
//				}
//			}
//		}System.out.println(max);
//		

		// -5. 연필 42자루와 지우개 28개를 최대한 많은 학생에게 똑같이 나누어 주려고합니다.
		// 몇명까지 나누어 줄 수 있는지 출력

		int max = 0;
		
		for (int i = 1; i <= 28; i++) {
			if (28 % i == 0 && 42 % i == 0) {
				if (max < i) {
					max = i;
				}
			}
		}System.out.println(max + "명의 학생들에게 나누어 줄수 있습니다.");

	}

}
