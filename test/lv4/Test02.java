package test.lv4;

//시작 시간 10 : 30
//종료 시간 11 : 30
//소요 시간 00 : 50
import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.
		/*
		 * #배열 컨트롤러[2단계] : 백터(Vecter) 1. 추가 . 값을 입력받아 순차적으로 추가 2. 삭제(인덱스) . 인덱스를 입력받아 해당
		 * 위치의 값 삭제 3. 삭제(값) . 값을 입력받아 삭제(중복값 X, 인덱스가 가장 작은 값 한 개 O) . 없는 값 입력 시 예외처리 4.
		 * 삽입 . 인덱스와 값을 입력받아 삽입
		 */
		Scanner scan = new Scanner(System.in);
		int[] arr = null;
		int cnt = 0;

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("1. 값 추가");
			System.out.println("2. 삭제(인덱스)");
			System.out.println("3. 삭제(값)");
			System.out.println("4. 삽입");
			System.out.println("메뉴를 선택해 주세요 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("추가할 값을 입력해 주세요 : ");
				int num = scan.nextInt();
				if (arr == null) {
					arr = new int[cnt + 1];
					arr[cnt] = num;
					cnt++;
				} else {
					int[] tmp = arr;
					arr = new int[cnt + 1];
					for (int i = 0; i < cnt; i++) {
						arr[i] = tmp[i];
					}
					arr[cnt] = num;
					cnt++;

				}
			} else if (sel == 2) {
				if (arr == null) {
					System.out.println("값 추가를 먼저 해주세요.");
					continue;
				}
				System.out.println("삭제할 인덱스를 입력해 주세요 : ");
				int index = scan.nextInt();
				if (index < 0 || index > cnt - 1) {
					System.out.println("해당 인덱스 값이 존재하지 않습니다.");
				} else {
					arr[index] = 0;
					for (int i = index; i < arr.length - 1; i++) {
						int x = 0;
						x = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = x;
					}
					int[] tmp = arr;
					arr = new int[cnt - 1];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = tmp[i];
					}
					cnt--;
				}
			} else if (sel == 3) {
				if (arr == null) {
					System.out.println("값 추가를 먼저 해주세요.");
					continue;
				}
				System.out.println("삭제할 값을 입력해 주세요 : ");
				int num = scan.nextInt();
				int index = -1;
				boolean isValue = true;
				for (int i = 0; i < cnt; i++) {
					if (arr[i] == num) {
						index = i;
						isValue = true;
						break;
					} else {
						isValue = false;
					}
				}
				if (isValue) {
					arr[index] = 0;
					for (int i = index; i < arr.length - 1; i++) {
						int x = 0;
						x = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = x;
					}
					int[] tmp = arr;
					arr = new int[cnt - 1];
					for (int i = 0; i < arr.length; i++) {
						arr[i] = tmp[i];
					}
					cnt--;
				} else {
					System.out.println("존재하지 않는 값입니다.");
				}
			} else if (sel == 4) {
				if (arr == null) {
					System.out.println("값 추가를 먼저 해주세요.");
					continue;
				}
				System.out.println("인덱스를 입력해주세요 : ");
				int index = scan.nextInt();
				System.out.println("값을 입력해주세요 : ");
				int num = scan.nextInt();
				if (index < 0 || index > cnt - 1) {
					System.out.println("해당인덱스에는 삽입할 수 없습니다.");
				} else {
					int[] tmp = arr;
					arr = new int[cnt + 1];
					int x = 0;
					for (int i = 0; i < arr.length; i++) {
						if (i == index) {
							arr[i] = num;
							continue;
						}
						arr[i] = tmp[x];
						x++;
					}
					cnt++;
				}

			} else {
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}

}
