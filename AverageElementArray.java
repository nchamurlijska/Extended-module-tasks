
public class AverageElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		double average = 0;
		double sum = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			average = sum/arr.length;
		}
			
			System.out.println("The average value is:" + average);
		}
	}


