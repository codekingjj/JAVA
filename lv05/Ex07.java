package lv05;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 끝말잇기 게임 제시어 : 자전거 입력 : 거미 제시어 : 거미 입력 : 미술 ...
		 */
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		while (true) {

			System.out.println("제시어 : " + start);
			System.out.println("입력 : ");
			String input = scan.next();
			int size = start.length();

			char lastWord = start.charAt(size - 1);
			char firstWord = input.charAt(0);
			if (lastWord == firstWord) {
				start = input;
			} else {
				System.out.println("끝!!");
				break;
			}
		}

	}
}
