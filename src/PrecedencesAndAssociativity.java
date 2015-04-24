public class PrecedencesAndAssociativity {

	public static void main(String[] args) {

		System.out.println(1 + 2 + "3"); // 33
		System.out.println("3" + 2 + 1.0f); // 321.0
		System.out.println("3" + 2 * 1.0f); // 32.0

		int a = 1;
		int b = 2;
		System.out.println(a = b = fuufi() + 5); // 10

		int x = 5;
		int y = 10;
		System.out.println(++x * y--); // 60

	}

	private static int fuufi() {
		return 5;
	}
}
