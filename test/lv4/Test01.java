package test.lv4;

import java.util.Arrays;

//시작 10 : 05
//종료 10 : 18
//소요 00 : 13
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		/*
		 * #석차 출력 . 성적 순으로 이름 출력
		 */
		String[] name = { "홍길동", "김영", "자바킹", "민병철", "메가맨" };
		int[] score = { 87, 42, 100, 11, 98 };

		for (int i = 0; i < score.length; i++) {
			int max = i;
			for (int j = i; j < score.length; j++) {
				if (score[max] < score[j]) {
					max = j;
				}
			}
			int x = 0;
			String y = "";
			x = score[i];
			score[i] = score[max];
			score[max] = x;
			y = name[i];
			name[i] = name[max];
			name[max] = y;
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));

	}

}
