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
			System.out.println("alls voll! wääh");
		} finally {
			System.out.println("*putz*");
		}

		try {
			dontthrowUp();
		} catch (Exception e) {
			System.out.println("Trotzdem öppis usecho?");
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
		throw new Exception("kroäh");
	}

	static void silentlyThrowUp() throws RuntimeException {
		throw new RuntimeException("kroähpfff");
	}

	static void dontthrowUp() throws Exception {
		// nur würgen
	}

}
