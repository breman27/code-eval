import java.util.ArrayList;

public class GetUniques {

	public static void main(String[] args) {
		String[] lines = { "6,7,7,8,9,10,11,12,13",
				"1,1,1,2,2,3,3,4,4",
				"5,5,6,7,8,9,9,10,11,12,13",
				"6,7,8,9,10,11,12,12,13,14,15",
				"15,16,16,17,18,19",
				"10,10,11,12,13,13,14,14",
				"15,16,17,18,19,20,21",
				"10,11,12,13,14,15",
				"10,11,12,13,14,15,16,16,17,18,19",
				"8,9,10,11,12,12,13",
				"13,14,14,14,14,15,16,17,17,18,19,19,20,21",
				"8,9,10,11,12,13,14,15,16,17",
				"2,3,4,5,5",
				"5,6,6,6,7,8,9,9,9,10,10",
				"1,2,3,4",
				"14,15,16,17,18,19,20,21,22,23",
				"9,10,11,12,12,13,13",
				"7,8,8,8,9,10,10,10,10,11,12",
				"2,2,2,2,2",
				"8,9,9,10,11,12,12,12,12" };
		for(String line : lines){
			getUniques(line);
		}
	}

	private static void getUniques(String line) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int[] numArray = makeNumArray(line);
		array.add(numArray[0]);
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] != numArray[i-1]) {
				array.add(numArray[i]);
			}
		}
		print(array);
	}

	private static void print(ArrayList<Integer> array) {
		if (!array.isEmpty()) {
			for (int i = 0; i < array.size() - 1; i++) {
				if (array.get(i) != 0) {
					System.out.print(array.get(i) + ",");
				}
			}
			System.out.println(array.get(array.size() - 1));
		}
	}

	private static int[] makeNumArray(String line) {
		String[] strForm = line.split("[\\W]");
		int[] result = new int[strForm.length];
		for (int i = 0; i < strForm.length; i++) {
			result[i] = Integer.parseInt(strForm[i]);
		}
		return result;
	}
}
