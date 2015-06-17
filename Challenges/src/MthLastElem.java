public class MthLastElem {

	public static void main(String[] args) {
		mthLastEle("a b c d 4");
	}

	private static void mthLastEle(String line) {
		String[] elems = line.split(" ");
		int m = Integer.parseInt(elems[elems.length - 1]);
		if (m <= elems.length - 1) {
			System.out.println(elems[elems.length - m - 1]);
		}
	}
}
