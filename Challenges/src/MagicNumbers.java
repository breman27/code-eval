import java.util.ArrayList;
import java.util.HashSet;

public class MagicNumbers {

	public static void main(String[] args) {
		sendMagic(8382, 8841);
	}

	private static void sendMagic(int a, int b) {
		boolean anyMagic = false;
		for (; a <= b; a++) {
			String s = getMagic(a);
			if (!s.isEmpty()) {
				anyMagic = true;
				System.out.print(s + " ");
			}
		}
		if (!anyMagic) {
			System.out.print("-1");
		}
		System.out.println();
	}

	private static String getMagic(int a) {
		String num = String.valueOf(a);
		char[] digits = num.toCharArray();
		ArrayList<Integer> visited = new ArrayList<Integer>();
		HashSet<Integer> v = new HashSet<Integer>();
		int pos = 0;
		int startingDigit = digits[pos] - '0';
		while (startingDigit != 0 && v.add(startingDigit)) {
			pos = (pos + startingDigit) % digits.length;
			startingDigit = digits[pos] - '0';
			visited.add(startingDigit);
		}
		if (v.size() == digits.length
				&& visited.get(visited.size() - 1) == digits[0] - '0') {
			return num;
		} else {
			return "";
		}
	}
}
