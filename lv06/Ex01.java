//package lv06;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//class Game {
//	int total;
//	Scanner scan = new Scanner(System.in);
//	Random random = new Random();
//	
//	int[] game = new int[6];
//	int[] idx = new int[3];
//	int[] myIdx = new int[3];
//	
//	void setGame() {
//		//set game
//		for(int i = 0; i<game.length; i++) {
//			game[i] = random.nextInt(10) + 1;
//			for(int j=0; j<i; j++) {
//				if(game[i] == game[j]) {
//					i --;
//				}
//			}
//		}
//		
//	}
//	
//	void makeQuiz() {
//		for(int i=0; i<idx.length; i++) {
//			idx[i] = random.nextInt(game.length);
//			
//			boolean isDupl = false;
//			
//			for(int j = 0; j<i; j++) {
//				if(idx[i] == idx[j]) {
//					isDupl = true;
//				}
//			}if (isDupl) {
//				i--;
//			}
//			else {
//				total += game[idx[i]];
//			}
//		}
//		
//	}
//	
//	void printQuiz() {
//		System.out.println(Arrays.toString(game));
//		System.out.println("total : " + total);
//		
//	}
//	int inputIndexAndGetResult() {
//		int result = 0;
//		for(int i = 0; i<myIdx.length; i++) {
//			System.out.printf("index %d : ", i +1);
//			myIdx[i] = scan.nextInt();
//			
//			if(myIdx[i] < 0 || myIdx[i] >= game.length) {
//				i --;
//				continue;
//			}
//			
//			boolean isDupl = false;
//			for(int j = 0; j<i; j++) {
//				if(myIdx[i] == myIdx[j]) {
//					isDupl = true;
//				}
//			}
//			if (isDupl) {
//				i --;
//			}
//			else {
//				result += game[myIdx[i]];
//			}
//		}
//	}
//	int getResult() {
//		int result = 0;
//		result = inputIndex();
//		return result;
//	}
//	void printResult(int result) {
//		if(total == result) {
//			System.out.println("딩동댕");
//		}
//		else {
//			System.out.println("땡");
//		}
//		
//	}
//	void run() {
//		setGame();
//		makeQuiz();
//		printQuiz();
//		printResult(getResult());
//		
//	}
//}
//public class Ex01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Game game = new Game();
//		game.run();
//	}
//
//}
