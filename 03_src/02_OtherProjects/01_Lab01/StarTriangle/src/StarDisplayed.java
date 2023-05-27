import java.util.Scanner;
public class StarDisplayed {

	public static void main(String[] args) {
		// Take the input:
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		int n = keyboard.nextInt();
		 
		// Solving:
		
		for (int i = 1; i <= n; i++) {
			String line = "";
			for (int j=1; j <=n-i;j++) {
				line += " ";
			}
			for (int k=1; k <= 2*i-1; k++) {
				line += "*";
			}
			System.out.println(line);
		}

	}

}
