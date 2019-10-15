package basics;

public class Loops {
	public static void forEach(String[] entries) {
		System.out.println("for each:");
		for (String entry: entries) {
			System.out.println(entry);
		}
	}

	public static void forLoop(int max) {
		System.out.println("for:");
		for (int i = 0; i < max; i++) {
			System.out.println("Number: " + i);
		}
	}

	public static void whileLoop(int max) {
		System.out.println("while:");
		int i = 0;
		while (i < max) {
			System.out.println("Number: " + i);
			i++;
		}
	}

	public static void doLoop(int max) {
		System.out.println("do:");
		int i = 0;
		do {
			System.out.println("Number: " + i);
			i++;
		} while (i < max);
	}
	
	public static void main(String[] args) {
		String[] entries = {"This", "is", "a", "test"};
		forEach(entries);
		
		forLoop(4);
		
		whileLoop(4);
		
		doLoop(4);
	}
}
