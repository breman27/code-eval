public class StringSubstitution {
	private static boolean[] offLimits;

	public static void main(String[] args) {
		String replace = "10011011001;0110,1001,1001,0,10,11";
		System.out.println(strSubstitutor(replace));
	}

	private static String strSubstitutor(String replace) {
		String[] args = replace.split("[\\W]");
		String original = args[0];
		offLimits = new boolean[original.length()];
		String copy = original, temp = "";
		for (int i = 1; i < args.length - 1; i += 2) {
			int location = bmSearch(copy, args[i]);
			while (offLimits[location]) {
				location += bmSearch(copy.substring(location+1), args[i])+1;
			}
			temp = "";
			temp += copy.substring(0, location) + args[i + 1];
			if(location + args[i].length() < copy.length())
				temp += copy.substring(location + args[i].length());
			copy = temp;
			setOffLimits(offLimits, location, args[i + 1]);
		}
		return temp;
	}

	private static void setOffLimits(boolean[] offLimits, int location,
			String string) {
		for (int i = location; i < location + string.length(); i++) {
			offLimits[i] = true;
		}
	}

	private static int bmSearch(String txt, String pattern) {
		int M = pattern.length();
		int N = txt.length();
		final int R = 256;
		int skip;

		int[] right = new int[R];
		for (int c = 0; c < R; c++)
			right[c] = -1;
		for (int j = 0; j < pattern.length(); j++)
			right[pattern.charAt(j)] = j;

		for (int i = 0; i <= N - M; i += skip) {
			skip = 0;
			for (int j = M - 1; j >= 0; j--) {
				if (pattern.charAt(j) != txt.charAt(i + j)) {
					skip = Math.max(1, j - right[txt.charAt(i + j)]);
					break;
				}
			}
			if (skip == 0)
				return i; // found
		}
		return N;
	}
}
