import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayoftheweek = 8;
		
		//Scanner day1 = new Scanner(System.in);
		//System.out.println("The first day of the week is ");
		//Scanner day2 = new Scanner(System.in);
		//System.out.println("The second day of the week is ");
		//Scanner day3 = new Scanner(System.in);
		//System.out.println("The third day of the week is ");
		//Scanner day4 = new Scanner(System.in);
		//System.out.println("The fourth day of the week is ");
		//Scanner day5 = new Scanner(System.in);
		//System.out.println("The fifth day of the week is ");
		//Scanner day6 = new Scanner(System.in);
		//System.out.println("The sixth day of the week is ");
		//Scanner day7 = new Scanner(System.in);
		//System.out.println("The seventh day of the week is ");
		
		//String firstDay = day1.nextLine();
		//String secondDay = day2.nextLine();
		//String thirdDay = day3.nextLine();
		//String fourthDay = day4.nextLine();
		//String fifthDay = day5.nextLine();
		//String sixthDay = day6.nextLine();
		//String seventhDay = day7.nextLine();
				
		switch(dayoftheweek) {
		case 1:
			System.out.println("The first day of the week is Monday");
			break;
		case 2:
			System.out.println("The second day of the week is Tuesday");
			break;
		case 3:
			System.out.println("The third day of the week is Wednesday");
			break;
		case 4:
			System.out.println("The fourth day of the week is Thursday");
			break;
		case 5:
			System.out.println("The fifth day of the week is Friday");
			break;
		case 6:
			System.out.println("The sixth day of the week is Saturday");
			break;
		case 7:
			System.out.println("The seventh day of the week is Sunday");
			break;
		default:
			System.out.println("No such day");
		}
	}

}
