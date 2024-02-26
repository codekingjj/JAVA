package lv03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1, 인덱스 2 입력 : 3
		// {10, 40, 30, 20, 50}
		boolean toRun = false;

		int tmp = 0;

		System.out.println("인덱스 1을 입력해주세요 : ");
		int index1 = scan.nextInt();
		System.out.println("인덱스 2를 입력해주세요 : ");
		int index2 = scan.nextInt();

		if (index1 >= 0 && index1 <= 4 && index2 >= 0 && index2 <= 4) {
			tmp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = tmp;
			toRun = true;
		}
		System.out.println(Arrays.toString(arr));
		if (toRun = false) {
			System.out.println("존재하지 않는 인덱스 입니다.");
		}

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40, 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		
		

		System.out.println("값 1을 입력해주세요 : ");
		int value1 = scan.nextInt();
		System.out.println("값 2를 입력해주세요 : ");
		int value2 = scan.nextInt();

		int isRun = 0;

		index1 = -1;
		index2 = -1;

		for(int i  = 0; i < 5; i++) {
			if (arr[i] == value1)
				index1 = i;
			if (arr[i] == value2) 
				index2 = i;
			
		}
		
		if (index1 == -1 || index2 == -1) {
			System.out.println("존재하지 않은 값이 포함되어 있습니다.");
			
		}else {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			System.out.println(Arrays.toString(arr));
		}
		

		int[] hakbun = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002, 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		int x = 0;
		int y = 0;

		System.out.println("첫번째 학번을 입력해 주세요 : ");
		int hakNum1 = scan.nextInt();
		System.out.println("두번째 학번을 입력해 주세요 : ");
		int hakNum2 = scan.nextInt();

		index1 = -1;
		index2 = -1;
		
		for(int i = 0; i < 5; i++) {
			if (hakbun[i] == hakNum1)
				index1 = i;
			if (hakbun[i] == hakNum2)
				index2 = i;
		}
		if (index1 == -1 || index2 == -1){
			System.out.println("존재하지 않는 학번입니다.");
		}else {
			int temp = scores[index1];
			scores[index1] = scores[index2];
			scores[index2] = temp;
		}
		System.out.println(Arrays.toString(scores));

	}

}
