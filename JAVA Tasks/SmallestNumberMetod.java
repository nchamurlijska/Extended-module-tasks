import java.util.Scanner;

public class SmallestNumberMetod {
	public static void smallestNumber(int num1, int num2, int num3) {
			
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println(num1 + " is the smallest");
		}
		else if (num2 <= num1 && num2 <= num3) {
			System.out.println(num2 + " is the smallest");
		}
		else {
			System.out.println(num3 + " is the smallest");
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestNumber(15,17,26);
		
	}
		
}
