package ch.ma3.ocajp;

public class OrderOfInitializationMethods {

	private static String s = m("1");

	static {
		s = m("2");
	}

	private static String x = m("3");

	{
		s = m("i1");
	}

	public OrderOfInitializationMethods() {
		s = m("c1");
	}

	{
		s = m("i2");
	}

	public static void main(String[] args) {
		OrderOfInitializationMethods ooim = new OrderOfInitializationMethods();
	}

	private static String m(String msg) {
		System.out.println(msg);
		return msg;
	}

}
