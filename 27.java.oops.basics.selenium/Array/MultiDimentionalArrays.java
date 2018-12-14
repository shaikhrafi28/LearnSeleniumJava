package Array;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//METHOD 1
		int a [] [] = new int [2] [3] ;
		a[0] [0] = 2;
		a[0] [1] = 4;
		a[0] [2] = 5;
	    a[1] [0] = 8;
		a[1] [1] = 9;
		a[1] [2] = 3;
		
		//METHOD 2
		int b [] [] = {{2,4,5},{7,8,9}};
		
		System.out.println(a[1][0]);

		// PRINT ALL THE VALUES IN OUTPUT FRO METHOD 1
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
			
		}
	}
}



