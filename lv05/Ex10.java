package lv05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #단어 교체하기(replace) 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아, 2. 교체해주는 기능을 구현한다.
		 */

		// replace() 메서드 사용X

		Scanner scan = new Scanner(System.in);

		String text = "Life is too too short.";
		System.out.println(text);

		System.out.println("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();

		System.out.println("변경할 단어를 입력하세요 : ");
		String newWord = scan.nextLine();
		
		String result = "";
		int size = text.length();
		
		for(int i = 0; i < size; i++) {
			int cnt = 0;
			for(int j = 0; j < word.length(); j++) {
				if (i+j < size && text.charAt(i+j) == word.charAt(j)) {
					cnt ++;
				}
			}
			if (cnt == word.length()) {
				result += newWord;
				i += word.length() -1;
			}else {
				result += text.charAt(i);
			}
		}
		System.out.println(result);
		
//		int num = text.length();
//		int plus = newWord.length() - word.length();
//		for (int i = 0; i < num; i++) {
//			int cnt = 0;
//			for (int j = 0; j < word.length(); j++) {
//				if (text.charAt(i + j) == word.charAt(j)) {
//					cnt++;
//				}else {
//					break;
//				}
//			}
//			if (cnt == word.length()) {
//				if (i == 0) {
//					text = newWord + text.substring(i + newWord.length(), text.length());
//				}else if (i == num -1) {
//					text = text.substring(0, i) + newWord;
//				}else {
//					text = text.substring(0, i) + newWord + text.substring(i + newWord.length(), text.length());
//					System.out.println(text);
//					num += plus;
//				}
//			}
//		}
//		System.out.println(text);
//		if (tmp >= 0) {
//			String subText = text;
//			
//		} else {
//			System.out.println("존재하지 않는 단어입니다.");
//		}
	}

}
