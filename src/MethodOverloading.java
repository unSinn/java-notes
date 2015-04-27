public interface MethodOverloading {

	int m();

	int m(int a);

	int m(float a, int b);

	int m(int a, float b);

	void m(float b);

	/*
	 * void m(int a, float b); => Method already defined. 
	 */

}
