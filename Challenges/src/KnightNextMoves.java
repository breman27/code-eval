public class KnightNextMoves {

	public static void main(String[] args) {
		String lines[] = { "c4", "f5", "e1", "h5", "e2", "g6", "c8", "h7",
				"b2", "g3", "d6", "a4", "a1", "e4", "g5", "c3", "e8", "b3",
				"h4", "d1", "a6", "a2", "d2", "h3", "b6", "a3", "h1", "d4",
				"e7", "f8", "f2", "g2", "f1", "d5", "a5", "e3", "h6", "c5",
				"d7", "f4" };
		for(String line : lines)
			getNextMoves(line);
	}

	private static void getNextMoves(String position) {
		String horizontal = "abcdefgh";
		String vertical = "12345678";
		int hPos = horizontal.indexOf(position.charAt(0));
		int vPos = vertical.indexOf(position.charAt(1));
		if (hPos - 2 >= 0 && vPos - 1 >= 0) {
			System.out.print(horizontal.charAt(hPos - 2) + ""
					+ vertical.charAt(vPos - 1) + " ");
		}
		if (hPos - 2 >= 0 && vPos + 1 < vertical.length()) {
			System.out.print(horizontal.charAt(hPos - 2) + ""
					+ vertical.charAt(vPos + 1) + " ");
		}
		if (vPos - 2 >= 0 && hPos - 1 >= 0) {
			System.out.print(horizontal.charAt(hPos - 1) + ""
					+ vertical.charAt(vPos - 2) + " ");
		}
		if (vPos + 2 < vertical.length() && hPos - 1 >= 0) {
			System.out.print(horizontal.charAt(hPos - 1) + ""
					+ vertical.charAt(vPos + 2) + " ");
		}
		if (vPos - 2 >= 0 && hPos + 1 < horizontal.length()) {
			System.out.print(horizontal.charAt(hPos + 1) + ""
					+ vertical.charAt(vPos - 2) + " ");
		}
		if (vPos + 2 < vertical.length() && hPos + 1 < horizontal.length()) {
			System.out.print(horizontal.charAt(hPos + 1) + ""
					+ vertical.charAt(vPos + 2) + " ");
		}
		if (hPos + 2 < horizontal.length() && vPos - 1 >= 0) {
			System.out.print(horizontal.charAt(hPos + 2) + ""
					+ vertical.charAt(vPos - 1) + " ");
		}
		if (hPos + 2 < horizontal.length() && vPos + 1 < vertical.length()) {
			System.out.print(horizontal.charAt(hPos + 2) + ""
					+ vertical.charAt(vPos + 1) + " ");
		}
		System.out.println();
	}
}
