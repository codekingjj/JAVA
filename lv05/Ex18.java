package lv05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		int count = 0;

		String fileName = "vector.txt";
		FileWriter fw = null;
		while (true) {
			System.out.println(Arrays.toString(vector));

			System.out.println("[백터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("값 입력 : ");
				int num = scan.nextInt();
				int[] tmp = vector;
				vector = new int[count + 1];
				for (int i = 0; i < count; i++) {
					vector[i] = tmp[i];
				}
				vector[count] = num;
				count++;
			} else if (sel == 2) {
				System.out.println("인덱스를 입력하시겠습니까? 값을 입력하시겠습니까?");
				System.out.println("[1]인덱스");
				System.out.println("[2]값");
				int sel2 = scan.nextInt();
				if (sel2 == 1) {
					System.out.println("인덱스를 입력해주세요 : ");
					int index = scan.nextInt();
					if (index < 0 || index >= count) {
						continue;
					}
					int idx = 0;
					int[] tmp = vector;
					vector = new int[count - 1];
					for (int i = 0; i < count; i++) {
						if (i != index) {
							vector[idx++] = tmp[i];
						}
					}
					count--;

				} else if (sel2 == 2) {
					System.out.println("값을 입력해주세요 : ");
					int value = scan.nextInt();
					boolean isValue = true;
					int delCnt = 0;
					for (int i = 0; i < count; i++) {
						if (vector[i] == value) {
							delCnt++;
						}
					}
					if (delCnt == 0) {
						continue;
					}
					int tmp[] = vector;
					vector = new int[count - delCnt];

					int idx = 0;
					for (int i = 0; i < count; i++) {
						if (tmp[i] != value) {
							vector[idx++] = tmp[i];
						}
					}
					count--;
				} else {
					System.out.println("입력값의 범위를 초과하였습니다.");
				}
			} else if (sel == 3) {
				String data = "";
				for (int i = 0; i < vector.length; i++) {
					data += vector[i];
					if (i != vector.length - 1) {
						data += ",";
					}
				}
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
					System.out.println("저장완료.");
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("저장실패.");
				}
			} else if (sel == 4) {
				String data = "";
				try {
					FileReader fr = new FileReader(fileName);
					BufferedReader br = new BufferedReader(fr);
					data += br.readLine();
					br.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				String[] tmp = data.split(",");
				vector = new int[tmp.length];
				for (int i = 0; i < vector.length; i++) {
					vector[i] = Integer.parseInt(tmp[i]);
				}
				count = vector.length;
			} else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}