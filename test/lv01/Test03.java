package test.lv01;

//시작 시간 : 02:52
//종료 시간 : 03:01
//소요 시간 : 00:09
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #놀이기구 이용제한 1. 키를 입력받는다. 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다. 3. 키가 120 미만이면,
		 * 놀이기구를 이용할 수 없다. 4. 단, 부모님과 함께 온 경우 놀이이구 이용이 가능하다. 예) 부모님과 함계 오셨나요?(yes : 1,
		 * no: 0)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("본인의 키를 입력해 주세요 : ");
		int height = scan.nextInt();

		if (height >= 120) {
			System.out.println("놀이기구 이용이 가능합니다.");
		} else if (height > 0 && height < 120) {
			System.out.println("놀이기구 이용이 불가능 하지만 부모님과 같이 오셨다면 가능합니다. 부모님과 같이 오셨습니까? 1) 그렇다 2) 아니다");
			int answer = scan.nextInt();
			if (answer == 1) {
				System.out.println("그렇다면 이용이 가능합니다.");
			} else if (answer == 2) {
				System.out.println("그렇다면 이용이 불가능하십니다.");
			} else {
				System.out.println("입력값의 범위를 초과하였습니다.");
			}
		} else if (height <= 0) {
			System.out.println("입력값의 범위를 초과하였습니다.");
		}

	}

}
