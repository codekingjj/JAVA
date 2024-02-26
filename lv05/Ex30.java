package lv05;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * # 콘솔 게시판 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다. 2. 현재 페이지 번호에 해당되는 게시글만 볼 수
		 * 있다. 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다. 4. 게시글을 추가하고 삭제할 때마다 파일입출력을
		 * 통해 데이터가 바로바로 저장된다. 5. 실행시 저장되어 있는 파일이 존대한다면, 바로 파일을 불러오도록 설계한다.
		 */

		Scanner scan = new Scanner(System.in);
		String fileName = "board.txt";
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;

		String[][] board = null;

		int count = 0; // 전체 게시글 수
		int pageSize = 5; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호

		while (true) {
			System.out.println("[게시판]");
			startRow = pageSize * (curPageNum - 1);
			endRow = startRow + 5;
			if (endRow > count) {
				endRow = count;
			}
			if (board != null) {
				for (int i = startRow; i < endRow; i++) {
					System.out.printf("%d. %s\n", i + 1, board[i][0]);
				}
			}
			System.out.printf("[%d / %dpage] (%d)\n", curPageNum, pageCount, count);
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int sel = scan.nextInt();

			if (sel == 1) {
				if (curPageNum == 1)
					continue;
				curPageNum--;
			} else if (sel == 2) {
				if (curPageNum >= pageCount) {
					continue;
				}
				curPageNum++;
			} else if (sel == 3) {
				System.out.print("제목 입력 : ");
				String title = scan.next();
				System.out.print("내용 입력 : ");
				String content = scan.next();

				String[][] tmp = board;
				board = new String[count + 1][2];

				for (int i = 0; i < count; i++) {
					board[i][0] = tmp[i][0];
					board[i][1] = tmp[i][1];
				}

				board[count][0] = title;
				board[count][1] = content;
				count++;
				pageCount = count / 5 + 1;

				String data = "";

				for (int i = 0; i < count; i++) {
					data += board[i][1];
					if (i < count - 1) {
						data += ",";
					}
				}

				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (sel == 4) {
				 
			} else if (sel == 5) {
				System.out.println("확인하고 싶은 게시물의 번호를 입력하세요 : ");
				int num = scan.nextInt();
				if (num > count || num < 0) {
					System.out.println("해당 게시물은 없습니다!");
					continue;
				}
				System.out.println(board[num - 1][1]);
			}

		}
	}

}
