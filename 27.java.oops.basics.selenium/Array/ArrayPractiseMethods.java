package Array;

public class ArrayPractiseMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPractiseMethods obj1 = new ArrayPractiseMethods();
		obj1.GetArraySum();
		obj1.GetDesiredIndex();
		obj1.declarearraym1();
}
   public void declarearraym1(){
	//DECLARING ARRAY METHOD 1
	
	int a[]= new int[5];//DECLARES AN ARRAY AND ALLOCATES MEMORY FOR THE VALUES
	a[0]= 8;
	a[1]= 4;
	a[2]= 6;
	a[3]= 9;
	a[4]= 1;//INITIALISED VALUE INTO THE ARRAY
	
	for (int i = 0; i < a.length; i++)
	{
		System.out.println(a[i]);
		
	}
   }
   
	 public void declarearraym2(){
			//DECLARING ARRAY METHOD 2
		 int b[] = {1,2,3,4,5,6};
		 
		 
		 for (int i = 0; i < b.length; i++)
			{
				System.out.println(b[i]);
				
			}
	
   }
//======================================================================================
//SUM OF NUMBERS IN THE ARRAY
	public void GetArraySum() {
		int c[] = { 1, 2, 3, 9, 5, 6 };
		int sum = 0;
		for (int i = 0; i < c.length; i++)// 5 times
		{
			// System.out.println(c[i]);
			sum = sum + c[i];
		}
		System.out.println("Sum is " + sum);

	}

//======================================================================================		

	public void GetDesiredIndex() {

		// to get desired index number of a value in array
		int c[] = { 1, 2, 3, 9, 5, 6, 7, 8, 9, 9 };

		for (int i = 0; i < c.length; i++)// 5 times
		{
			if (c[i] == 9)

			{
				System.out.println("Index number is " + i);
				break;// if we dont give break. all the indexes of 9 will be printed.
			}
		}

	}

}
