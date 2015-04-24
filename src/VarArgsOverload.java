public interface VarArgsOverload {

	void m(int[] p);

	/* void m(int... p); -> Compiler error */

	void m(int p); // while this obviously works

	/* int m(int... p); -> And this would obviously not work too */

}
