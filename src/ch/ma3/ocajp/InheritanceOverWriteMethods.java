package ch.ma3.ocajp;

interface I1 {
	int getValue();
}

public abstract class InheritanceOverWriteMethods implements I1 {
	void getValue(int a) { // This works because we don't overwrite the original
							// method (different signature).
		System.out.println("blubb");

	}
}
