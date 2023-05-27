import java.util.Scanner;
public class DaysOfMonth {
	public static void main(String args[]) {
		// Take the input month:
		Scanner keyboard = new Scanner(System.in);
		int NumberDay = 0;
		do {
			System.out.print("Enter the month: ");
			String month = keyboard.nextLine();
			switch(month) {
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				NumberDay = 31;
				break;
			case "Februrary":
			case "Feb.":
			case "Feb":
			case "2":
				NumberDay = 28;
				break;

			case "March":
			case "Mar.":
			case "Mar":
			case "3":
				NumberDay = 31;
				break;

			case "April":
			case "Apr.":
			case "Apr":
			case "4":
				NumberDay = 30;
				break;

			case "May":
			case "5":
				NumberDay = 31;
				break;

			case "June":
			case "Jun":
			case "6":
				NumberDay = 30;
				break;

			case "July":
			case "Jul":
			case "7":
				NumberDay = 31;
				break;

			case "August":
			case "Agu.":
			case "Agu":
			case "8":
				NumberDay = 31;
				break;

			case "September":
			case "Sept.":
			case "Sep":
			case "9":
				NumberDay = 30;
				break;

			case "October":
			case "Oct.":
			case "Oct":
			case "10":
				NumberDay = 31;
				break;

			case "November":
			case "Nove.":
			case "Nove":
			case "11":
				NumberDay = 30;
				break;

			case "December":
			case "Dec.":
			case "Dec":
			case "12":
				NumberDay = 31;
				break;

			
			default:
				System.out.println("Please enter again!");
			}
		} while (NumberDay == 0);
		
		// Take the input year:
		System.out.print("Enter the year: ");
		String strYear = keyboard.nextLine();
		while (strYear.length() != 4) {
			System.out.print("Please enter again");
			System.out.print("Enter the year: ");
			strYear = keyboard.nextLine();
		}
		
		int year = Integer.parseInt(strYear);
		if (NumberDay == 28) {
			if (year % 400 == 0) {
				NumberDay += 1;
			} else if (year % 100 == 0){
				NumberDay += 0;
			} else if (year % 4 == 0) {
				NumberDay += 1;
			}
		}
		
		// Print the outpint:
		System.out.println("The number of days is: " + NumberDay);
	}
}
