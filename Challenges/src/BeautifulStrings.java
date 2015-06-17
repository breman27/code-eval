import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BeautifulStrings {
	private static int tester = 0;
	public static void main(String[] args) {
		String str = "Ignore punctuation, please";
		analyze(str);
		str = str.toLowerCase();
		for(char c : str.toCharArray())
			construct(c);
		System.out.println("\n" + tester + "\n" + tester/str.length());
	}
	private static void analyze(String str){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		str = str.toLowerCase().replaceAll("[\\W]", "");
		for(int i = 0; i < str.length(); i++){
		   char c = str.charAt(i);
		   Integer val = map.get(new Character(c));
		   if(val != null){
		     map.put(c, new Integer(val + 1));
		   }else{
		     map.put(c,1);
		   }
		}
		int frequency = 26;
		for(int value : map.values()){
			tester += value * frequency;
			frequency--;
		}
		System.out.println(map.values());
	}
	private static void construct(char c){
		switch(c){
		case 'a':
			tester += 24;
			break;
		case 'b':
			tester += 25;
			break;
		case 'c':
			tester += 26;
			break;
		case 'd':
			tester += 12;
			break;
		case 'e':
			tester += 23;
			break;
		case 'f':
			tester += 9;
			break;
		case 'g':
			tester += 13;
			break;
		case 'h':
			tester += 10;
			break;
		case 'i':
			tester += 21;
			break;
		case 'j':
			tester += 2;
			break;
		case 'k':
			tester += 11;
			break;
		case 'l':
			tester += 16;
			break;
		case 'm':
			tester += 7;
			break;
		case 'n':
			tester += 22;
			break;
		case 'o':
			tester += 20;
			break;
		case 'p':
			tester += 19;
			break;
		case 'q':
			tester += 6;
			break;
		case 'r':
			tester += 15;
			break;
		case 's':
			tester += 14;
			break;
		case 't':
			tester += 18;
			break;
		case 'u':
			tester += 17;
			break;
		case 'v':
			tester += 5;
			break;
		case 'w':
			tester += 4;
			break;
		case 'x':
			tester += 3;
			break;
		case 'y':
			tester += 8;
			break;
		case 'z':
			tester += 1;
			break;
		default:
			tester += 0;
			break;
		}
	}
}
