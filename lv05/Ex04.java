package lv05;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11/100/89";
		// 문제 1) arr배열에 각 점수를 저장하고, 총점 출력
		// 정답1) 200
		int[] arr = new int[3];
		int sum = 0;
		String[] score = str.split("/");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(score[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		// 문제 2) scores 배열의 각 점수를 슬래쉬를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = { 11, 100, 89 };
		String text = "";
		for (int i = 0; i < scores.length; i++) {
			text += scores[i];
			if (i != scores.length - 1) {
				text += "/";
			}
		}
		System.out.println(text);
	}

}
