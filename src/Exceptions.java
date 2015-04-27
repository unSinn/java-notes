import java.io.UncheckedIOException;

public class Exceptions {

	public static void main(String[] args) {

		try {
			throwUp();
		} catch (Exception e) {
			System.out.println("igitt");
		}

		try {
			throwUp();
		} catch (Exception e) {
			System.out.println("alls voll! w��h");
		} finally {
			System.out.println("*putz*");
		}

		try {
			dontthrowUp();
		} catch (Exception e) {
			System.out.println("Trotzdem �ppis usecho?");
		} finally {
			System.out.println("*phew*");
		}

		try {
			silentlyThrowUp();
			return;
		} finally {
			System.out.println("Hesch du grad kotzt?!");
		}

	}

	static void throwUp() throws Exception {
		throw new Exception("kro�h");
	}

	static void silentlyThrowUp() throws RuntimeException {
		throw new RuntimeException("kro�hpfff");
	}

	static void dontthrowUp() throws Exception {
		// nur w�rgen
	}

}
