package basics;

public class ArraySum {

	public static void main(String[] args) {
		double[] numbers = { 1.1, 2.2, 3.3 };
		System.out.println("[v1] Sum of {1.1, 2.2, 3.3} = " + arraySum1(numbers));
		System.out.println("[v2] Sum of {1.1, 2.2, 3.3} = " + arraySum2(numbers));
		System.out.println("[v3] Sum of {1.1, 2.2, 3.3} = " + arraySum3(numbers));
		System.out.println("[v4] Sum of {1.1, 2.2, 3.3} = " + arraySum4(numbers));
	}
	
	public static double arraySum1(double[] numbers) {
		double sum = 0;
		for (double number: numbers) {
			sum += number;
		}
		return sum;
	}

	public static double arraySum2(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static double arraySum3(double[] numbers) {
		double sum = 0;
		int i = 0;
		while (i < numbers.length) {
			sum += numbers[i];
			i++;
		}
		return sum;
	}

	public static double arraySum4(double[] numbers) {
		double sum = 0;
		int i = 0;
		do {
			sum += numbers[i];
			i++;
		} while (i < numbers.length);
		return sum;
	}

}
