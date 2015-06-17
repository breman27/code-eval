
public class Capitalize {
	public static void main(String[] args){
		String line = "1st thing";
		System.out.println(capitalize(line));
	}

	private static String capitalize(String line) {
		String[] words = line.split(" ");
		String result = "";
		for(String word : words){
			word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
			result += word + " ";
		}
		result.trim();
		return result;
	}
}
