import java.util.Scanner;

public class MiddleCharacterMethod {

public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = word.nextLine();
		int wordlength = str.length();
		//int middle = wordlength/2;
		//char ch[]=str.toCharArray();
		//System.out.println("Middle Character is: "+ middle);
		
		for (int i = 0; i < wordlength; i++) {
			
		
		//int position;
		//int length;
		int even = 0;
		int odd = 0;
		int length = wordlength;
		char streven[] = new char[10];
		char strodd[] = new char[10];
				
		for (int j = 0; j < length; j++) {
			
			String  myString    =   word.nextLine();
			
			if (j % 2 == 0) {
				streven[even] = myString.charAt(j);
				even++;
		}
			if (j%2 == 1) {
				strodd[odd] = myString.charAt(j);
				odd++;
			}
		}
		System.out.println("Middle Character is: " + streven[even]);
	}
}
}