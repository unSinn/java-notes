public class Casting {

	public static void main(String[] args) {
		// This won't compile:
		// String s = 63 + new Integer(10);
		// String b = 5

		// Solutions
		String c = 5 + "";
		String d = new Integer(10).toString();
	}

}
