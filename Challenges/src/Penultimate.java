
public class Penultimate {

	public static void main(String[] args) {
		System.out.println(penultimate("sunt explicabo"));
	}
    private static String penultimate(String line){
        String[] sentence = line.split(" ");
        return sentence[sentence.length-2];
    }
}
