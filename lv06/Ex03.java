package lv06;

//나만의 계산기

class MyCalculator {
	int[] nums = { 10, 20 };

	// + (return O, parameter O)
	int sum(int a, int b) {
		return a + b;
	}

	// - (return O, parameter X)
	int minus() {
		return nums[0] - nums[1];
	}

	// * (return X, parameter X)
	void multiple() {
		System.out.println(nums[0] * nums[1]);
	}

	// / (return X, patameter O)
	void divide(int a, int b) {
		System.out.println((double) a / b);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calculator = new MyCalculator();

		// 메소드 모두 호출
		calculator.sum(1, 2);
		calculator.minus();
		calculator.multiple();
		calculator.divide(10, 3);
	}

}
