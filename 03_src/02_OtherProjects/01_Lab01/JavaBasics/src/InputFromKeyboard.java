import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you");
		int strAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double strHeight = keyboard.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + strAge + " years old" + "Your height is " + strHeight + ".");
	}
}
