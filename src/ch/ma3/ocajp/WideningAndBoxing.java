package ch.ma3.ocajp;
public class WideningAndBoxing {

	public static void main(String[] args) {
		/* widening */
		long a = 1 + 5l;

		/* boxing */
		Integer b = 1 + 5;

		/* This works 1st wideing "long + long" then boxing to Long. */
		Long c = 5l + 4;

		/* This does not work, int or Integer can't be cast to Long */
		// Long d = 6 + 7;

		/* But funny enough this works */
		Long e = new Long(6) + new Long(7);

		/* But the box classes all extend Number */
		Number f = 10 + 10l + 10f + 10d + new Byte((byte) 0x0A);
		System.out.println(f + " " + f.getClass().getSimpleName());
		
		int i = 100;
		for(;(i >0);i--){}
	}
}
