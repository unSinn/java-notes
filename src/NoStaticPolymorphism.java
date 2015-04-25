public class NoStaticPolymorphism {

	public static void main(String... args) {
		Volvo v = new Volvo();
		Car c = v;
		System.out.format("(%s,%s)(%s,%s)", v.getName(), v.getPs(),
				c.getName(), c.getPs());
	}

}

class Volvo extends Car {
	static String getName() {
		return "Volvo";
	}

	long getPs() {
		return 220;
	}
}

class Car {
	static String getName() {
		return "Car";
	}

	long getPs() {
		return 5;
	}
}