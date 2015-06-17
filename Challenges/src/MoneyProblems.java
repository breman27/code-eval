public class MoneyProblems {

	public static void main(String[] args) {
		String line = "1 | 3 | 1 2";
		System.out.println(newDenoms(line));
	}

	private static int newDenoms(String line) {
		String[] args = line.split("[|]");
		int dMult = 0;
		int C = Integer.parseInt(args[0]);
		int V = Integer.parseInt(args[1]);
		String[] D = args[2].split(" ");
		for(int i = 0; i <= V; i++){
			while(dMult <= C){
				
			}
		}
		return 0;
	}

}
