import java.util.Scanner;

public class CountWordsMethod {
	
	public static int main(String[] args) {
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String text = sc.nextLine();
		
		//int count = 1;

		for (int i = 0; i < text.length() - 1; i++)
		{
			if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' '))
			{
				count++;
			}
		}

		System.out.println("Number of words in a string = " + count);
		return count;
	}
}