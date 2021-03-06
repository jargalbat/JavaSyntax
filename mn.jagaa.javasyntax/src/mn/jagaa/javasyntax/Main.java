package mn.jagaa.javasyntax;

import java.math.BigDecimal;

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
		print();
		statements();
		expressions();
		variables();
		literals();
		conditions();
		loops();
		methods();
		encapsulation();
		constructor();
		abstraction();
		numberFormat();
	}

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print() {
		System.out.println("");
		System.out.printf("5 * 2 = 10\n");
		System.out.printf("5 * 2 = 10").println();
		System.out.printf("%d * %d = %d", 5, 2, 7);

		String s1="cpp";
        int x="65";
        System.out.printf("%-15s%03d%n", s1, x);
		// java           100 
		// cpp            065 
		
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
		//
		// Primitive types (Анхдагч төрлүүд)
		//
		byte b = 127; // 8 bits -128 to 127
		short s = 32767; // 16 bits -32,768 to 32,767
		int i = 2147483647; // 32 bits -2,147,483,648 to 2,147,483,647
		long l = 123; // 64 bits -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

		float f = 123.5f; // 32 bits - Don't use for financial
		double d = 13.0d; // 64 bits - Don't use for financial

		boolean bool = false;
		char c = 'A'; // 16 bits '\u0000' to 'uffff'

		// Sizes
		System.out.println(Byte.SIZE); // 8 bits
		System.out.println(Byte.BYTES); // 1 byte
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -128

		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); // 4 bytes
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648

		// Conversion
		i = (int) l; // Explicit conversion (Ил хөрвүүлэлт)
		l = i; // Implicit conversion (Далд хөрвүүлэлт)
		f = (float) d;

		// octal(8) number
		// decimal(10) number - 0 to 9
		// hexadecimal(16) number - 0 to 9, A to F
		int eight = 010; // starts 0
		int fifteen = 0xF;
		int sixteen = 0x10; // starts 0x

		// Operators
		int j = ++i; // pre increment
		j = i++; // post increment

		// Relational operators
		// > < <= >= != ==

		// Logical operators
		// && || ^(XOR)
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ false); // false

		// Single &
		j = 15;
		i = 10;
		System.out.println(j > 15 && i++ > 5); // i++ > 5 шалгахгүй
		System.out.println(j); // 15
		System.out.println(i); // 10

		System.out.println(j > 15 & i++ > 5); // i++ > 5 шалгана
		System.out.println(j); // 15
		System.out.println(i); // 11

		// BigDecimal - Immutable (өөрчлөгдөхгүй) class
		var number1 = new BigDecimal("34.56789876");
		System.out.println(number1); // 34.56789876
		System.out.println(new BigDecimal(34.56789876)); // 34.56789875999999850364474696107208728790283203125

		var number2 = new BigDecimal("34.2234");
		System.out.println(number2);

		var number3 = number1.add(number2);
		System.out.println(number3);
		System.out.println(number1.add(number2));

		System.out.println(number1.multiply(new BigDecimal(3)));
		System.out.println(number1.divide(new BigDecimal(2)));

		var calculator = new InterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calcTotal(5);
		System.out.println(totalValue);

		// Financial
		var bd1 = new BigDecimal("34.56789876");
		var bd2 = new BigDecimal("34.2234");
		System.out.println(bd1.add(bd2)); // 68.79129876
		System.out.println(34.56789876 + 34.2234); // 68.79129875999999

		//
		// Reference types (Лавлах төрлүүд - Заагч)
		//

	}

	private static void literals() {
		// Literals (Бичиг үсэг)
		String str = "test";
		System.out.println("1" + 2 + 3); // 123
		System.out.println("1" + (2 + 3)); // 15

		int i = 5;
		System.out.println("i = " + i);

		// Lexicographically larger. -int, 0, +int
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes" : "No");
        
		// Capitalize first letter
		String A = "john";
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
		A = A.replaceFirst(A.substring(0, 1), A.substring(0, 1).toUpperCase());
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

	private static void encapsulation() {
		// Encapsulation (Бүрхүүл)
		// Use methods to access data.
		// You can't be accessed from outside the class.

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike(100); // constructor

		ducati.start();

		ducati.setSpeed(-100);
		System.out.println(ducati.getSpeed());

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());

		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
	}

	private static void constructor() {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike(100);
	}

	private static void abstraction() {
		// Abstraction (Хийсвэрлэл)
		// Don't really need to understand what's happening inside

	}

	
	/// Static
	static boolean flag;
	static int B = -1;
	static int H = 2;
	static {
    	if (B <= 0 || H <= 0) {
        	System.out.println("java.lang.Exception: Breadth and height must be positive");
    	} else {
        	flag = true;
    	}
	}

	public static void numberFormat() {
        double payment = 100d;
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}

	 public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("EEEE");
        return dateFormat.format(date).toUpperCase(); 
        // return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();
    }
}
