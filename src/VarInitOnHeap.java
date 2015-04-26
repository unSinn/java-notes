public class VarInitOnHeap {

	int a;
	int b = 0;

	public static void main(String... a) {
		VarInitOnHeap vioh = new VarInitOnHeap();
		vioh.m(42);
	}

	public void m(int c) {
		int d;
		int e = 0;

		a++; // this is ok, a is on the heap and heap variables are initialized
				// with the default value.
		System.out.print(a); // 1
		
		b++;
		c++;
		// d++; -> this would not compile, d is on the stack and has to be
		// initialized.
		e++;
	}
}
