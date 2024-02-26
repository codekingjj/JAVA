package lv05;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		String[] name = new String[3];
		int[] score = new int[3];
		String str = "김철/87, 이만수/42, 이영희/100";
		String[] tmp = str.split(",");

		System.out.println(Arrays.toString(tmp));
		for (int i = 0; i < tmp.length; i++) {
			String x = tmp[i];
			String[] y = x.split("/");
			for (int j = 0; j < 2; j++) {
				if (j % 2 == 0) {
					name[i] = y[j];
				} else {
					score[i] = Integer.parseInt(y[j]);
				}
			}
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}

}
