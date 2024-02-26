package lv03;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #즉석복권 1. 숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
		 */

		Scanner scan = new Scanner(System.in);
		int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };

		// Test Case
		// int [] lotto = {7, 0, 7, 7, 0, 7, 0, 7}; //꽝
		// int [] lotto = {7, 7, 7, 7, 0, 7, 0, 7}; //당첨
		// int [] lotto = {7, 7, 7, 7, 7, 7, 7, 7}; //당첨
		// int [] lotto = {0, 0, 0, 0, 0, 0, 7, 7}; //꽝

		int count = 0;
		System.out.println("1) 복권 결과확인");
		System.out.println("메뉴 선택 : ");
		int sel = scan.nextInt();
		
//		if (sel == 1) {
//			int count = 0;
//			
//			for(int i = 0; i < 8; i++) {
//				if(lotto[i] == 7)
//					count ++;
//				else
//					count = 0;
//				
//				if(count == 3)
//					
//			}
//		}

//		if (sel == 1) {
//			for (int i = 0; i < 6; i++) {
//				if (lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) {
//					System.out.println("당첨!");
//					count++;
//					break;
//				}
//			}
//			if (count == 0) {
//				System.out.println("꽝!");
//			}
//		}
	}

}
