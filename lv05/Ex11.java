package lv05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예회처리를 위한 구문
		// try-catch 문
		
		// 0. Exception
		
		// 1. ArrayIndexOutOfBoundsException
//		int[] arr = new int[3];
//		System.out.println(arr[3]);
//		try {
//		int[] arr = new int[3];
//		System.out.println(arr[3]);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.err.println("인덱스 범위가 유효하지 않습니다.");
//		}
//		System.out.println("hello");
		// 2. NullPointerException
//		try {
//			String str = null;
//			System.out.println(str.length());
//		}catch(NullPointerException e) {
//			e.printStackTrace();
//		}

		// 3. ArithmeticException
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		// 4. InputMismatchException
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("num : ");
			int num = scan.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		// 5. NumberFormatException
		try {
			String number = "1234a";
			int num = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
