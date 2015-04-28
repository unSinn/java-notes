package ch.ma3.ocajp;
public class OrderOfInitializationMethods {

	private static String s = m("1");

	static {
		s = m("2");
	}

	{
		s = m("3");
	}

	public OrderOfInitializationMethods() {
		s = m("4");
	}

	public static void main(String[] args) {
		OrderOfInitializationMethods ooim = new OrderOfInitializationMethods();
	}

	private static String m(String msg) {
		System.out.println(msg);
		return msg;
	}

}
