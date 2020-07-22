
public class PalinCheck {
	public static boolean palcheck(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
