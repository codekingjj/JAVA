package lv01;

import java.util.Random;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int number = random.nextInt(50) + 1;

		int ten = number / 10;
		int one = number % 10;
		int count = 0;

		if (ten == 3 || ten == 6 || ten == 9) {
			count += 1;
		}
		if (one == 3 || one == 6 || ten == 9) {
			count += 1;
		}

		if (count == 0) {
			System.out.println(number + " : " + number);
		} else if (count == 1) {
			System.out.println(number + " : 짝");
		} else if (count == 2) {
			System.out.println(number + " : 짝짝");
		}
	}

}
