import java.util.Scanner;

public class TriangleByAngles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ang1 = new Scanner(System.in);
		System.out.println("Vuvedi purvi ugul: ");
		Scanner ang2 = new Scanner(System.in);
		System.out.println("Vuvedi vtori ugul: ");
		Scanner ang3 = new Scanner(System.in);
		System.out.println("Vuvedi treti ugul: ");
		
		String angle1 = ang1.nextLine();
		String angle2 = ang2.nextLine();
		String angle3 = ang3.nextLine();
		
		double sum = Double.valueOf(angle1) + Double.valueOf(angle2) + Double.valueOf(angle3);
			System.out.println("Sumata na uglite e: " + sum);
		
		if (sum<=180 && Double.valueOf(angle3) == 90) {
			System.out.println("The triangle is right angled");
		} 
			 else if (sum<=180 && (Double.valueOf(angle3)) > 90) {
				System.out.println("The triangle is obtuse");
		}    else if (sum<=180 && Double.valueOf(angle1)<90 && Double.valueOf(angle2)<90 && Double.valueOf(angle3)<90) {
				System.out.println("The triangle is acute");
		}
			 else if (sum<=180 && Double.valueOf(angle1)==Double.valueOf(angle2)) {
				 System.out.println("The triangle is isosceles ");
		}
			 else if (sum<=180 && Double.valueOf(angle1)==Double.valueOf(angle2) && Double.valueOf(angle2)==Double.valueOf(angle3)) {
				 System.out.println("The triangle is equilateral");
			 }
			 else if (sum<=180 && Double.valueOf(angle1)!=Double.valueOf(angle2) && Double.valueOf(angle2)!=Double.valueOf(angle3))	{
				 System.out.println("The triangle is multifaceted");
			 }
		else {
				System.out.println("The triangle cannot be built");
		}
	}
}
