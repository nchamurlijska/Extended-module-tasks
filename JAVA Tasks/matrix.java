
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		arr[2][0]=9;
		arr[2][1]=10;
		arr[2][2]=11;
		arr[2][3]=12;
		
		for (int rows = 0; rows < 4; rows++) {
			for (int columns = 0; columns < 3; columns++) { 
			System.out.println(arr[rows][columns]);
				
			}
		}
		
		
	}

}
