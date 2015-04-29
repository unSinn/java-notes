package ch.ma3.ocajp;

public class InitializationFun {

	static int a, b = 10;
	int c;

	public static void main(String... args) {
		System.out.format("a: %d, b: %d\n", a, b); // a: 0, b: 10

		// This gives a compiler error because c is a instance variable.
		// c = 15;

		// But you could do something like this:
		String s1, s2;
		s1 = s2 = "Blublubb";
		System.out.format("%s %s", s1, s2);

	}

}
