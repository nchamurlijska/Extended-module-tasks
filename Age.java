import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		String vuzrast = age.nextLine();
		double godini = Double.valueOf(vuzrast);
		
		if (godini >= 16) {
			System.out.println("You are eligible to work");
	}
		else {
			System.out.println("You are not eligible to work");
}
}
}