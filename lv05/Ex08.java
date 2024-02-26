package lv05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #타자연습 게임[1단계] 1. 문제를 섞는다.(shuffle) 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료 예) 문제 :
		 * mysql 입력 : mydb 문제 : mysql 입력 : mysql 문제 : jsp 3. 문제 출제시 랜덤한 위치에 *별 찍기(캐릭터
		 * 숨기기) 4. 정답이 아니면 별 위치가 변하면 X 5. words[i]의 문자열과 일치 하면 정답
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		String[] words = { "java", "mysql", "jsp", "spring" };
		String[] example = new String[words.length];

		for (int i = 0; i < 100; i++) {
			int rNum = random.nextInt(words.length);

			String temp = words[0];
			words[0] = words[rNum];
			words[rNum] = temp;
		}
		for (int i = 0; i < words.length; i++) {
			String arr[] = words[i].split("");
			int x = words[i].length();
			int index = random.nextInt(arr.length);
			arr[index] = "*";
			example[i] = "";
			for (int j = 0; j < x; j++) {
				example[i] += arr[j];

			}
		}
		for (int i = 0; i < words.length; i++) {
			String question = words[i];
			System.out.println("문제 : " + example[i]);
			System.out.println("입력 : ");
			String answer = scan.next();
			if (!question.equals(answer)) {
				i--;
			}
		}
	}

}
