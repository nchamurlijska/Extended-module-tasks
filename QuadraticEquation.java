import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Vuvedi stoynost 1:");
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Vuvedi stoynost 2:");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Vuvedi stoynost 3:");
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Vuvedi stoynost 4:");
		
		String a = sc1.nextLine();
		String b = sc2.nextLine();
		String c = sc3.nextLine();
		String x = sc4.nextLine();
		double result = Double.valueOf(a) * Double.valueOf(x) * Double.valueOf(x) + Double.valueOf(b) * Double.valueOf(x) + Double.valueOf(c);
		System.out.println("Tova e rezultata: " + result);
	}

}
