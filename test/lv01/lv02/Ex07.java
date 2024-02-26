//package test.lv01.lv02;
//
////시작시간 : 15 : 55
////종료 시간 : 16 : 05
////소요 시간 ; 00 : 10
//public class Ex07 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 문제 7
//		/*
//		 * -1. 36의 약수 를 전부 출력 약수는 36과 나눠서 나머지가 0인 수를 말한다. 1,2,4,6....
//		 * 
//		 * -2. 24의 약수중에서 2의 배수만 출력
//		 * 
//		 * -3 18의 약수의 갯수 더하기 21의 약수의 갯수를 출력
//		 * 
//		 * -4 50부터 100까지의 자연수중에서 9의 배수는 모두 몇개?
//		 */
//
//		// 1)
//		for (int i = 1; i <= 36; i++) {
//			if (36 % i == 0) {
//				System.out.println(i);
//			}
//		}
//
//		// 2)
//		for (int i = 1; i <= 24; i++) {
//			if (24 % i == 0) {
//				if (i % 2 == 0) {
//					System.out.println(i);
//				}
//			}
//		}
//
//		// 3)
//		int count = 0;
//		for (int i = 1; i <= 18; i++) {
//			if (18 % i == 0) {
//				count++;
//			}
//		}
//		for (int i = 1; i <= 21; i++) {
//			if (21 % i == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//		// 4)
//		int count = 0;
//		for (int i = 50; i <= 100; i++) {
//			if (i % 9 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//}
