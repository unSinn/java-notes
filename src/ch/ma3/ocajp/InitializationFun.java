package ch.ma3.ocajp;
public class InitializationFun {

	static int a, b = 10;

	public static void main(String... args) {
		System.out.format("i: %d, j: %d\n", a, b); // i: 0, j: 10

		// But you could do something like this:
		String s1, s2;
		s1 = s2 = "Blublubb";
		System.out.format("%s %s", s1, s2);

	}

}
