import java.util.HashSet;

public class HappyNumbers {
	private static int[] a = { 608, 653, 109, 106, 109, 63, 601, 940, 940, 193,
			653, 487, 118, 364, 791, 262, 223, 89, 409, 749, 7 };

	public static void main(String[] args) {
		for (int i : a)
			System.out.println(checkHappy(i) ? "1":"0");
	}

	private static boolean checkHappy(int i) {
		int newNum = 0;
		HashSet<Integer> checkedNums = new HashSet<Integer>();
		while (i != 1 && checkedNums.add(i)) {
			newNum = 0;
			while (i > 0) {
				newNum += Math.pow(i % 10, 2);
				i /= 10;
			}
			i = newNum;
		}
		return i == 1;
	}
//	private static boolean checkHappy(int number) {
//		int m = 0;
//		int digit = 0;
//		HashSet<Integer> cycle = new HashSet<Integer>();
//		while (number != 1 && cycle.add(number)) {
//			m = 0;
//			while (number > 0) {
//				digit = (int) (number % 10);
//				m += digit * digit;
//				number /= 10;
//			}
//			number = m;
//		}
//		return number == 1;
//	}
}
