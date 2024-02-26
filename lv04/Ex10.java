package lv04;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = { 1, 2, 3, 2, 1 };
		int test2[] = { 1, 3, 4, 4, 2, 100 };
		int test3[] = { 1, 1, 1, 2, 1 };
		int zeroCount1 = 0;
		int zeroCount2 = 0;
		int zeroCount3 = 0;

		// test1
		for (int i = 0; i < test1.length; i++) {
			int x = test1[i];
			int count = 0;
			for (int j = 0; j < test1.length; j++) {
				if (x == test1[j]) {
					count++;
				}
			}
			if (count == 1) {
				test1[i] = 0;
			}
		}

		for (int i = 0; i < test1.length; i++) {
			for (int j = 0; j < test1.length; j++) {

				if (j != test1.length - 1 && test1[j] == 0) {
					int x = 0;
					x = test1[j];
					test1[j] = test1[j + 1];
					test1[j + 1] = x;
				}
				if (i == test1.length - 1 && test1[j] != 0) {
					int x = 0;
					x = test1[i - 1];
					test1[i - 1] = test1[i];
					test1[i] = x;
				}
			}

		}
		for (int i = 0; i < test1.length; i++) {
			if (test1[i] == 0) {
				zeroCount1++;
			}
		}
		int[] tmp1 = test1;
		test1 = new int[test1.length - zeroCount1];
		for (int i = 0; i < test1.length; i++) {
			test1[i] = tmp1[i];
		}
		//
		// test2

		for (int i = 0; i < test2.length; i++) {
			int x = test2[i];
			int count = 0;
			for (int j = 0; j < test2.length; j++) {
				if (x == test2[j]) {
					count++;
				}
			}
			if (count == 1) {
				test2[i] = 0;
			}
		}

		for (int i = 0; i < test2.length; i++) {
			for (int j = 0; j < test2.length; j++) {

				if (j != test2.length - 1 && test2[j] == 0) {
					int x = 0;
					x = test2[j];
					test2[j] = test2[j + 1];
					test2[j + 1] = x;
				}
				if (i == test2.length - 1 && test2[j] != 0) {
					int x = 0;
					x = test2[i - 1];
					test2[i - 1] = test2[i];
					test2[i] = x;
				}
			}

		}
		for (int i = 0; i < test2.length; i++) {
			if (test2[i] == 0) {
				zeroCount2++;
			}
		}
		int[] tmp2 = test2;
		test2 = new int[test2.length - zeroCount2];
		for (int i = 0; i < test2.length; i++) {
			test2[i] = tmp2[i];
		}
		//
		// test3
		for (int i = 0; i < test3.length; i++) {
			int x = test3[i];
			int count = 0;
			for (int j = 0; j < test3.length; j++) {
				if (x == test3[j]) {
					count++;
				}
			}
			if (count == 1) {
				test3[i] = 0;
			}
		}

		for (int i = 0; i < test3.length; i++) {
			for (int j = 0; j < test3.length; j++) {

				if (j != test3.length - 1 && test3[j] == 0) {
					int x = 0;
					x = test3[j];
					test3[j] = test3[j + 1];
					test3[j + 1] = x;
				}
				if (i == test3.length - 1 && test3[j] != 0) {
					int x = 0;
					x = test3[i - 1];
					test3[i - 1] = test3[i];
					test3[i] = x;
				}
			}

		}
		for (int i = 0; i < test3.length; i++) {
			if (test3[i] == 0) {
				zeroCount3++;
			}
		}
		int[] tmp3 = test3;
		test3 = new int[test3.length - zeroCount3];
		for (int i = 0; i < test3.length; i++) {
			test3[i] = tmp3[i];
		}
		System.out.println(Arrays.toString(test1));
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.toString(test3));
	}

}
