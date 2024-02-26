package lv05;

import java.util.Random;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 *로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다.(점수는 5점씩 감점)
		// 조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료 (점수 출력)

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int score = 100;

		String word = "performance";
		String meaning = "공연";

		int size = word.length();
		int check[] = new int[size];
		int open = 0;
		while (true) {
			System.out.println("뜻 : " + meaning);

			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 0) {
					System.out.print("*");
				} else {
					System.out.print(word.charAt(i));
				}
			}
			System.out.println("\n영어단어를 입력하세요 >>> ");
			String input = scan.next();

			if (input.equals(word)) {
				break;
			} 
			while(true) {
				int rIdx = random.nextInt(size);
				
				if (check[rIdx] == 0) {
					
					char target = word.charAt(rIdx);
					
					for (int i = 0; i<size; i++) {
						if(target == word.charAt(i)) {
							check[i] = 1;
							open ++;
						}
					}
					break;
				}
			}
			if(open == size) {
				break;
			}
//			for (int i = 0; i < input.length(); i++) {
//				char x = input.charAt(i);
//				
//			}
		}
		System.out.println(score);
	}

}
