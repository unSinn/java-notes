package ch.ma3.ocajp;
public class Strings {
	public static void main(String[] args) {
		String s = " SunDay ";
		s.trim().toLowerCase().equals("saturday");
		System.out.println(s);

		String d = s;
		s += "Bla";
		System.out.println(d);
		System.out.println(s);
	}

}
