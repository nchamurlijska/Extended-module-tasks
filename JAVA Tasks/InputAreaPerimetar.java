import java.util.Scanner;

public class InputAreaPerimetar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner strA = new Scanner(System.in);
		System.out.println("Vuvedi strana A na triugulnik: ");
		Scanner strB = new Scanner(System.in);
		System.out.println("Vuvedi strana B na triugulnik: ");
		Scanner strC = new Scanner(System.in);
		System.out.println("Vuvedi strana C na triugulnik: ");
		Scanner visochina = new Scanner(System.in);
		System.out.println("Vuvedi visochinata na triugulnika: ");
		
		String stoynost1 = strA.nextLine();
		String stoynost2 = strB.nextLine();
		String stoynost3 = strC.nextLine();
		String stoynost4 = visochina.nextLine();
		double perimetar = Double.valueOf(stoynost1) + Double.valueOf(stoynost2) + Double.valueOf(stoynost3);
		System.out.println("Tova e perimetara: " + perimetar);
		double area = Double.valueOf(stoynost1) * Double.valueOf(stoynost4);
		System.out.println("Tova e liceto: " + area);
	}

}
