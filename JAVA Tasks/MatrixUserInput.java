import java.util.Scanner;

public class MatrixUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		Scanner nulaNula = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 0,0: ");
		Scanner nulaEdno = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 0,1: ");
		Scanner nulaDve = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 0,2: ");
		Scanner ednoNula = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 1,0: ");
		Scanner ednoEdno = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 1,1: ");
		Scanner ednoDve = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 1,2: ");
		Scanner dveNula = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 2,0: ");
		Scanner dveEdno = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 2,1: ");
		Scanner dveDve = new Scanner(System.in);
		System.out.println("Vuvedi za indeks 1,2: ");
		
		String stoynost1 = nulaNula.nextLine();
		String stoynost2 = nulaEdno.nextLine();
		String stoynost3 = nulaDve.nextLine();
		String stoynost4 = ednoNula.nextLine();
		String stoynost5 = ednoEdno.nextLine();
		String stoynost6 = ednoDve.nextLine();
		String stoynost7 = dveNula.nextLine();
		String stoynost8 = dveEdno.nextLine();
		String stoynost9 = dveDve.nextLine();

		
		System.out.println("Tova e masiva: " + arr.length);
		
	
	}

}
