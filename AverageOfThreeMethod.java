
public class AverageOfThreeMethod {

	public static double AverageOfThree(int num1, int num2, int num3) {
		int avg = (num1+num2+num3)/3;
		return avg;
		//System.out.println(avg + " is the average of these three");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = AverageOfThree(3,33,3);
		//AverageOfThree(10,20,50);
		System.out.println(avg);
	
}
}