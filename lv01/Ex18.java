package lv01;

import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면 , 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함꼐 온 경우 놀이기구 이용이 가능하다.
		 * 	예) 부모님과 함께 오셨나요?(yes : 1, no : 0)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		if (height >= 120) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		}
		if (height < 120) {
			System.out.println("놀이기구를 이용할 수 없습니다.");
			System.out.println("부모님과 함께 오셨나요?(yes : 1, no : 0) : ");
			int response = scan.nextInt();
			
			if (response == 1) {
				System.out.println("그러면 이용하실 수 있습니다.");
			}
			if (response == 0) {
				System.out.println("그러면 이용하실 수 없습니다.");
			}
		}
		
	}

}
