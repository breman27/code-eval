public class BitPositions {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				String s = String.format("%4d", i*j);
				s.trim();
				System.out.print(s);
			}
			System.out.println();
		}
	}

	private static boolean bitPos(int n, int a, int b) {
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		return binary.charAt(a - 1) == binary.charAt(b - 1);
	}
}
