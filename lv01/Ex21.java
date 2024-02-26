package lv01;

import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int tmp = x;
		
		if (tmp < y) {
			tmp = y;
		}
		if (tmp < z) {
			tmp = z;
		}
		System.out.println(tmp);
		
		
		
	}

}
