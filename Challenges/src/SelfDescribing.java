public class SelfDescribing {
	public static void main(String[] args) {
		String line = "753";
		line = reverse(line);
		isSelfDescribing(line);
	}

	private static void isSelfDescribing(String line) {
		int i = Integer.parseInt(line);
		
		System.out.println(Integer.toHexString(i));
	}

	private static String reverse(String line) {
		return new StringBuilder(line).reverse().toString();
	}
}
