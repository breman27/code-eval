public class NModM {

	public static void main(String[] args) {
		nModM("20, 13");
	}
    private static void nModM(String line){
        String[] args = line.split("[,]");
        int n = Integer.parseInt(args[0].trim());
        int m = Integer.parseInt(args[1].trim());
        while(n > m-1){
            n = n - m;
        }
        System.out.println(n);
    }
}
