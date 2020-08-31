import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
			System.out.println("Original array is: ");		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Array in reverse is: ");
		for (int i = arr.length -1; i>=0; i--) { 
		System.out.println(arr[i] + " ");
			
		}
	}

}
