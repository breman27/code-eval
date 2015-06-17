public class WordToNum {
	public static void main(String[] args) {
		String word = "zero;two;four;three;seven;eight;nine";
		System.out.println(wordToInt(word));
	}

	private static String wordToInt(String word) {
		String[] words = word.split(";");
		String build = "";
		for (String s : words) {
			switch (s) {
			case "zero":
				build += "0";
				break;
			case "one":
				build += "1";
				break;
			case "two":
				build += "2";
				break;
			case "three":
				build += "3";
				break;
			case "four":
				build += "4";
				break;
			case "five":
				build += "5";
				break;
			case "six":
				build += "6";
				break;
			case "seven":
				build += "7";
				break;
			case "eight":
				build += "8";
				break;
			case "nine":
				build += "9";
				break;
			}
		}
		return build;
	}
}
