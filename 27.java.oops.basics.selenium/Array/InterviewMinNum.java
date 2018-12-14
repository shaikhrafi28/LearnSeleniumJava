package Array;

public class InterviewMinNum {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewMinNum obj1 = new InterviewMinNum();
		//obj1.printMinimum();
		//obj1.printMaximum();
		obj1.MaxNumInMinColumn();
		
	}
	
	/* 2 4 5
	 * 3 4 7
	 * 1 2 9
	 * Print minimum number fromm the above matrix?
	 */
	
		public void printMinimum()
		{
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min = abc[0][0];//DECLARE A MINIMUM NUMBER
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min= abc[i][j];
				}
			}
		}
		System.out.println(min);
	}
		
		
		
		/* 2 4 5
		 * 3 4 7
		 * 1 2 9
		 * Print minimum number fromm the above matrix?
		 */
		
		public void printMaximum()
		{
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int max = abc[0][0];//DECLARE A MINIMUM NUMBER
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				if(abc[i][j]>max)
				{
					max= abc[i][j];
				}
			}
		}
		System.out.println(max);
	}
		/* 2 4 5
		 * 3 4 7
		 * 1 2 9
		 *FIND MAX NUM IN THE COLUMN HAVING MINIMUM NUMBER
		 */
		
		/*ALGORITHM
		 *Find the minimum number.
		 *Identify the column of minimum number.
		 *Find the maximum number in identified column
		 */
	public void MaxNumInMinColumn() {
		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };
		int min = abc[0][0];
		int mincolumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {

					min = abc[i][j];// minimum number

					mincolumn = j;// column of minimum number

				}

			}

		}
		int max = abc[0][mincolumn];
		int k = 0;
		while (k < 3) {
			if (abc[k][mincolumn] > max) {
				max = abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}
	
	
	
	
	
	
		
		public void printMaximum1D()
		{
		int a1[]= {2,4,5,3,4,7,1,2,9};
		int max = a1[0];//DECLARE A MINIMUM NUMBER
		
		for(int i = 0;i<a1.length;i++)
		{

			if (a1[i] > max) {
				max = a1[i];
			}
		}
		
		
		System.out.println(max);
		}
		
		
		
		public void print2ndMax1D()
		{
		int a1[]= {2,4,5,3,4,7,1,2,9};
		int max = a1[0];//DECLARE A MINIMUM NUMBER
		
		for(int i = 0;i<a1.length;i++)
		{

			if (a1[i] > max) {
				max = a1[i];
			}
		}
		
		
		
		System.out.println(max);
		}
}
	


