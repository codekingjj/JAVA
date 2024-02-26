package lv02;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #369게임[2단계] 1. 1~50까지 반복을 한다. 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		 */

//		int n = 1;
//		while (n <= 50) {
			// count 플러스 마이너스
			
			int n = 1;
			while (n <= 50) {
				int x = n / 10;
				int y = n % 10;
				
				int count = 0;
				
				if (x % 3 == 0 && x != 0) 
					count ++;
				if (y % 3 == 0 && y != 0)
					count ++;
				
				if (count > 0) {
					while (count > 0) {
						System.out.print("짝");
						count --;
					}
				} else {
					System.out.print(n);
				}
				System.out.println("");
				n++;
			}
			
			
			
			
			
			
			
//			if (n / 10 == 3) {
//				if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
//					System.out.println("짝짝");
//				} else {
//					System.out.println("짝");
//				}
//			} else if (n / 10 != 3) {
//				if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
//					System.out.println("짝");
//				} else {
//					System.out.println(n);
//				}
//			}
//			n++;
//		}

	}
}
