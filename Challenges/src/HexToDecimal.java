
public class HexToDecimal {

	public static void main(String[] args) {
		System.out.println(hexToDec("4a"));
	}
    private static int hexToDec(String str) {
        String digits = "0123456789ABCDEF";
        str = str.toUpperCase();
        int val = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
