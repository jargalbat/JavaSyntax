package mn.jagaa.javasyntax;

/**
 * @author jarga
 *
 */
/**
 * @author jarga
 *
 */
public class Main {
	public static void main(String[] args) {
//		print();
//		statements();
//		expressions();
//		variables();
//		literals();
//		conditions();
//		loops();
		methods();
	}

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print() {
		System.out.println("");
		System.out.printf("5 * 2 = 10\n");
		System.out.printf("5 * 2 = 10").println();
		System.out.printf("%d * %d = %d", 5, 2, 7);

	}

	private static void statements() {
		int a = 1;
	}

	private static void expressions() {
		// Илэрхийлэл (= ;)
		int a = 1;
		int b = 1;
		System.out.println(a++);
		System.out.println(++b);

	}

	private static void variables() {
		// Primitive types (Анхдагч төрлүүд)
		byte b = 127; // 8 bits -128 to 127
		short s = 32767; // 16 bits -32,768 to 32,767
		int i = 2147483647; // 32 bits -2,147,483,648 to 2,147,483,647
		long l = 123; // 64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

		float f = 123.5f; // 32 bits - Don't use for financial
		double d = 13.0; // 64 bits - Don't use for financial

		boolean bool = false;
		char c = 'A'; // 16 bits '\u0000' to 'uffff'

		// Reference types (Лавлах төрлүүд - Заагч)

	}

	private static void literals() {
		// Literals (Бичиг үсэг)
		String str = "test";
		System.out.println("1" + 2 + 3); // 123
		System.out.println("1" + (2 + 3)); // 15

		int i = 5;
		System.out.println("i = " + i);

	}

	private static void conditions() {
		int i = 5;

		if (i > 5) {
			System.out.println("Hi");
		} else if (i < 5) {
			System.out.println("Konichiwa");
		} else {
			System.out.println("Hallo");
		}
	}

	private static void loops() {
		for (int i = 0; i < 10; i++) {
			//
		}
	}

	private static void methods() {

	}

}
