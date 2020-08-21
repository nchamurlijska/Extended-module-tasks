
public class DivisibleFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,15,32,42,55,75,122,132,150,180,200};
		//int i = 0;
		for (int i = 0; i < arr.length; i++) {	
					
			if (arr[i] % 5 == 0 && arr[i]<150) {
		
				System.out.println("the values divisible to five is: " + arr[i]);
			}
			if (arr[i]>=150) {
				break;
			}
				
		}
	}
}