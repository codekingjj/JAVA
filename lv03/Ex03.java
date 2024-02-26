package lv03;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 문제 1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
//		// 예 1) 87, 11, 92, 14, 47
//
		Random random = new Random();
//
//		int[] arr = new int[5];
//		for (int i = 0; i < 5; i++) {
//			int rNum = random.nextInt(100) + 1;
//			arr[i] = rNum;
//			System.out.println(arr[i]);
//		}
//
//		// 문제 2) 전교생의 총점과 평균 출력
//		// 예 2) 총점(251) 평균(50.2)
//		int[] arr = new int[5];
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			int rNum = random.nextInt(100) + 1;
//			arr[i] = rNum;
//			System.out.println(arr[i]);
//			sum += arr[i];
//		}
//		double avg = sum / 5.0;
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
//
//		// 문제 3) 성적이 60점 이상이면 합격. 합격생 수 출력
//		// 예 3) 2명
		int[] arr = new int[5];
		int count = 0;
		for (int i = 0; i < 5; i++) {
			int rNum = random.nextInt(100) + 1;
			arr[i] = rNum;
			System.out.println(arr[i]);
			if (arr[i] >= 60) {
				count++;
			}
		}
		System.out.printf("합격자 수는 %d명 입니다.", count);

	}

}
