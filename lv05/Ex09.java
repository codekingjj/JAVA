package lv05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/*
		 * #단어 검색 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다. 2. 단어가 존재하면 true 단어가 없으면
		 * false를 출력한다. 3. contains() 사용 안함
		 */
		Scanner scan = new Scanner(System.in);

		boolean isRight = true;
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		String a = text.toLowerCase();
		String b = word.toLowerCase();
		// word를 검색하기 위한 시작점
		//text : abxd
		//		 012
		//word : ab
		boolean result = false;
		for(int i =0; i <= a.length()-b.length(); i++) {
			int cnt = 0;
			for(int j = 0; j < b.length(); j++) {
				if(a.charAt(i+j) == b.charAt(j)) {
					cnt++;
				}
			}
			if(cnt == b.length()) {
				result = true;
			}
		}
//		for (int i = 0; i < text.length(); i++) {
//			for (int j = 0; j < word.length(); j++) {
//				if (text.charAt(i) != word.charAt(j)) {
//					isRight = false;
//				}
//			}
//			if (isRight == false) {
//				break;
//			}
//		}
//		System.out.println(isRight);
//		for (int i = 0; i < str.length; i++) {
//			for (int j = 0; j < check.length; j++) {
//				if (str[i].equals(check[j])) {
//					isRight = true;
//					break;
//				}else {
//					isRight = false;
//				}
//			}
//		}
//		System.out.println(text.matches(word));
		// [true] life, short, short., to, Life is
		// [false] Life is too short!!!, soot
	}
}
