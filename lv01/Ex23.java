package lv01;

import java.util.Random;
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제 1) 1~10
		// 문제 2) 3~7
		// 문제 3) -3~3
		// 문제 4) 2~5
		// 문제 5) 1000~9999
		
		Random random = new Random();
		
		
		int ranNum1 = random.nextInt(10) + 1;
		int ranNum2 = random.nextInt(5) + 3;
		int ranNum3 = random.nextInt(7) - 3;
		int ranNum4 = random.nextInt(4) + 2;
		int ranNum5 = random.nextInt(9000) + 1000;
		
		int rNum1 = (int) (Math.random() * (10 - 1 + 1)) + 1;
		int rNum2 = (int) (Math.random() * (7 - 3 + 1)) + 3;
		int rNum3 = (int) (Math.random() * (3 - (-3) + 1)) + (-3);
		int rNum4 = (int) (Math.random() * (5 - 2 + 1)) + 2;
		int rNum5 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
		
		System.out.println(ranNum1);
		System.out.println(ranNum2);
		System.out.println(ranNum3);
		System.out.println(ranNum4);
		System.out.println(ranNum5);
		System.out.println();
		System.out.println(rNum1);
		System.out.println(rNum2);
		System.out.println(rNum3);
		System.out.println(rNum4);
		System.out.println(rNum5);
	}

}
