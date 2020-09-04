
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 330, 7, 1001, 14, 26, 48, 99};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max)
				max = arr[i];
		}
		System.out.println("The largest number is: " + max);
	}

}

