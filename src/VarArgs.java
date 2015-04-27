import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VarArgs {

	public static void main(String[] args) {
		print("a", "b"); // 2
		print(new String[] { "c", "d", "e" }); // 3
		print(); // 0

		String[] x = null; // Now deal with this compiler!
		print(x); // finally a NullPointerException
	}

	static void print(String... args) {
		System.out.println(args.length);

		List<String> list = Arrays.asList(args);
		list.stream().forEach(System.out::println);

	}

}
