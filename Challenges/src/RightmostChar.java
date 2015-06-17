
public class RightmostChar {
	public static void main(String[] args){
		System.out.println(getRightChar("OnLTigLw5nRsX5M6mA89EeGvSHroCpPnVKnlUqUNLsbnYKEa8ORECxXNI9Dwl","O"));
	}

	private static int getRightChar(String string, String string2) {
        for(int i = string.length()-1; i >= 0; i--){
            if(string.substring(i, i+1).equals(string2)){
                return i;
            }
        }
        return -1;
	}
}

//public static void main (String[] args) throws IOException {
//    File file = new File(args[0]);
//    BufferedReader buffer = new BufferedReader(new FileReader(file));
//    String line;
//    while ((line = buffer.readLine()) != null) {
//        line = line.trim();
//        System.out.println(getRightChar(line));
//    }
//}
//private static int getRightChar(String line){
//    String[] args = line.split("[\\W]");
//    return args[0].lastIndexOf(args[1\]);
//}
