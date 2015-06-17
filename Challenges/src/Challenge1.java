import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		getInfo();
	}

	public static void getInfo() {
		int age;
		String name, username;
		System.out.println(Math.pow(95800, 4) + Math.pow(217519, 4) + Math.pow(414560, 4) == Math.pow(422481, 4));
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		System.out.println("What is your reddit username? ");
		username = keyboard.next();
		
		System.out.printf("Your name is %s, you are %d years old, and your username is %s", name, age, username);
	}
}
