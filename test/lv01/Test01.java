package test.lv01;

//시작 54:00
//종료 16:00
//소요 22:00

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1)
		// 가위바위보 게임 만들기
		// ㄴ 0가위 2바위 2보
		// com : 랜덤 0~2 추출
		// me : 입력 0~2
		// 승자 출력

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("----가위바위보 게임---");
		System.out.println("내고 싶은 것의 번호를 입력해 주세요!\n 0) 가위 1) 바위 2) 보");
		int inputRSPNum = scan.nextInt();
		int cpuRSPNum = random.nextInt(3);
		String cpuRSP = "";
		String inputRSP = "";
		String result = "";

		if (cpuRSPNum == 0) {
			cpuRSP = "가위";
		} else if (cpuRSPNum == 1) {
			cpuRSP = "바위";
		} else if (cpuRSPNum == 2) {
			cpuRSP = "보";
		}

		if (inputRSPNum == 0) {
			inputRSP = "가위";
		} else if (inputRSPNum == 1) {
			inputRSP = "바위";
		} else if (inputRSPNum == 2) {
			inputRSP = "보";
		}

		System.out.println("가위~~ 바위~~ 보~~!");
		System.out.printf("상대방이 낸 것 : %s", cpuRSP);
		System.out.printf("\n내가 낸 것 : %s", inputRSP);

		if (inputRSPNum == 0 && cpuRSPNum == 2) {
			result = "이겼습니다~";
		} else if (inputRSPNum == 1 && cpuRSPNum == 0) {
			result = "이겼습니다~";
		} else if (inputRSPNum == 2 && cpuRSPNum == 1) {
			result = "이겼습니다~";
		} else if (inputRSPNum == cpuRSPNum) {
			result = "비겼습니다~";
		} else {
			result = "졌습니다...ㅜ";
		}
		System.out.println("\n" + result);
	}
}
