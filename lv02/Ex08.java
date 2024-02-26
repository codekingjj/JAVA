package lv02;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 ; 6 (54, 63, 72, 81, 90, 99)

		int n = 50;
		int count = 0;
		while (n <= 100) {
			if (n <= 100 && n % 9 == 0) {
				count++;
			}
			n++;
		}
		System.out.println(count);

		// 문제 5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980

//		int n =100;
//		int tmp = 0;
//		while (n < 1000) {
//			if (n % 28 == 0) {
//				tmp = n;
//			}
//			n ++;
//		}System.out.println(tmp);

		// 문제 6) 8의 배수를 작은수부터 5개 출력 == > 답 : 8, 16, 24, 32, 40
//		int n = 1;
//		int count = 1;
//		
//		while (count <= 5) {
//			if (n % 8 == 0) {
//				count ++;
//				System.out.println(n);
//			}
//			n ++;
//		}

	}

}
