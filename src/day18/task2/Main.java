package day18.task2;

public class Main {
	public static void main(String[] args) {
		System.out.println(count7(717771237));
	}

	public static int count7(int value) {
		if (value == 0) return 0;

		if ((value + 3) % 10 == 0) {
			value /= 10;
			return 1 + count7(value);
		} else {
			value /= 10;
			return 0 + count7(value);
		}
	}
}
