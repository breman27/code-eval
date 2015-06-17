import java.util.ArrayList;

public class MixedContent {

	public static void main(String[] args) {
		String[] lines = {
				"8,33,21,0,16,50,37,0,melon,7,apricot,peach,pineapple,17,21",
				"24,13,14,43,41" };
		for (String line : lines) {
			seperate(line);
		}
	}

	private static void seperate(String line) {
		String[] items = line.split("[\\W]");
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < items.length; i++) {
			try {
				nums.add(Integer.parseInt(items[i]));
			} catch (Exception e) {
				words.add(items[i]);
			}
		}
		print(words, nums);
	}

	private static void print(ArrayList<String> words, ArrayList<Integer> nums) {
		if (!words.isEmpty()) {
			for (int i = 0; i < words.size() - 1; i++) {
				System.out.print(words.get(i) + ",");
			}
			if (nums.isEmpty()) {
				System.out.println(words.get(words.size() - 1));
			} else {
				System.out.print(words.get(words.size() - 1));
			}
		}
		if (!words.isEmpty() && !nums.isEmpty()) {
			System.out.print("|");
		}
		if (!nums.isEmpty()) {
			for (int i = 0; i < nums.size() - 1; i++) {
				System.out.print(nums.get(i) + ",");
			}
			System.out.println(nums.get(nums.size() - 1));
		}
	}
}
