package lv03;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int[] hakbuns = null;
		int[] scores = null;
		// TODO Auto-generated method stub
		// 랜덤 점수 (1~100) scores에 5개 저장
		// 학번을 (1001~1005) hakbuns에 5개 저정
		hakbuns = new int[5];
		scores = new int[5];

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int rNum = random.nextInt(100) + 1;
			scores[i] = rNum;
			System.out.println(scores[i]);
		}

		for (int i = 0; i < 5; i++) {
			hakbuns[i] = (i + 1) + 1000;
		}

		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스를 입력 : 1 성적 : 11점
//		System.out.println("인덱스를 입력해 주세요 : ");
//		int index = scan.nextInt();
//		if (index >= 1 && index <= 5) {
//			System.out.printf("성적 : %d\n", scores[(index - 1)]);
//		} else {
//			System.out.println("찾는 인덱스가 없습니다.");
//		}

		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11 인덱스 : 1

//		System.out.println("성적을 입력해주세요 : ");
//		int score = scan.nextInt();
//		for (int i = 0; i < 5; i++) {
//			if (score >= 1 && score <= 100) {
//				if (score == scores[i]) {
//					System.out.printf("인덱스 : %d", i + 1);
//				}
//			}
//		}
		// 문제3 ) 학번을 입력받아 성적 출력
		// 문제3 ) 학번 입력 : 1003 성적 : 45점

//		System.out.println("학번을 입력해 주세요 : ");
//		int indexNum = 0;
//		int hakbun = scan.nextInt();
//
//		for (int i = 0; i < 5; i++) {
//			if (hakbun >= 1001 && hakbun <= 1005) {
//				if (hakbun == hakbuns[i]) {
//					indexNum = i;
//				}
//			}
//		}
//		System.out.printf("%d의 성적 : %d", hakbun, scores[indexNum]);

		// 문제) 1등 학생의 학번과 성적 출력
		// 정답) 1004번(98점)

		int max = scores[0];
		int indexNum = 0;

		for (int i = 0; i < 5; i++) {
			if (max <= scores[i]) {
				max = scores[i];
				indexNum = (i);
			}
		}
		System.out.printf("%d번 (%d점)", hakbuns[indexNum], max);
	}

}
