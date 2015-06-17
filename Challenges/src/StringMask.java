
public class StringMask {

	public static void main(String[] args) {
		mask("k 1");
	}
    private static void mask(String line){
        String[] args = line.split("[ ]");
        String str = args[0];
        String bitString = args[1].trim();
        String newStr = "";
        for(int i = 0; i < bitString.length(); i++){
            if(bitString.charAt(i) == '1'){
                newStr += Character.toUpperCase(str.charAt(i));
            }
            else{
            	newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
