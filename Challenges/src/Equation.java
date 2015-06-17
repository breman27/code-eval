
public class Equation {

	public static void main(String[] args) {
		for(int i = 0; i < 24; i++){
			System.out.println(24.5 - 5.5 * Math.sin(((2*Math.PI)*(i + 1))/24) + " " + i);
		}
	}
}
