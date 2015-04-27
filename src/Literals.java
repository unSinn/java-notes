public class Literals {

	public static void main(String[] args) {
		int a = 14_000; // decimal: 14'000
		int b = 015; // octal: 8 + 5 = 13
		int c = 0x16; // hexadecimal: 16 + 6 = 22
		
		System.out.format("a:%d b:%d c:%d", a, b, c);
		
	}

}
