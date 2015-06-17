
public class TextToNumber {

	public static void main(String[] args) {
		getNum("two thousand four hundred");
	}

	private static void getNum(String string) {
		String[] allNums = string.split(" ");
		boolean negFlag = false;
		int realNum = 0;
		for(String num : allNums){
			switch(num){
			case "negative":
				negFlag = true;
				break;
			case "zero":
				realNum += 0;
				break;
			case "one":
				realNum += 1;
				break;
			case "two":
				realNum += 2;
				break;
			case "three":
				realNum += 3;
				break;
			case "four":
				realNum += 4;
				break;
			case "five":
				realNum += 5;
				break;
			case "six":
				realNum += 6;
				break;
			case "seven":
				realNum += 7;
				break;
			case "eight":
				realNum += 8;
				break;
			case "nine":
				realNum += 9;
				break;
			case "ten":
				realNum += 10;
				break;
			case "eleven":
				realNum += 11;
				break;
			case "twelve":
				realNum += 12;
				break;
			case "thirteen":
				realNum += 13;
				break;
			case "fourteen":
				realNum += 14;
				break;
			case "fifteen":
				realNum += 15;
				break;
			case "sixteen":
				realNum += 16;
				break;
			case "seventeen":
				realNum += 17;
				break;
			case "eighteen":
				realNum += 18;
				break;
			case "nineteen":
				realNum += 19;
				break;
			case "twenty":
				realNum += 20;
				break;
			case "hundred":
				realNum = realNum - (realNum%10 * 100);
				break;
			case "thousand":
				realNum = (realNum%10 * 1000);
				break;
			}
		}
		System.out.println(realNum);
	}

}
