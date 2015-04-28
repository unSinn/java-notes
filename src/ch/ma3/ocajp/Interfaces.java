package ch.ma3.ocajp;
public class Interfaces {

	interface Base {
		boolean m1();

		byte m2(short s);
	}

	class Class2 implements Base {

		public boolean m1() { // has to be public
			return false;
		}

		@Override
		public byte m2(short s) {
			return 0;
		}

	}
}
