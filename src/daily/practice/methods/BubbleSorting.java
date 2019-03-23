package daily.practice.methods;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[]= {0,2,1,3,5};
		//BubbleSorting bs=new BubbleSorting();
		
		System.out.println(a.length+" Size of Array");
		
	    // before sorting 
		System.out.println("Before Sorting Arrays elements and there respective position");
		for (int i=0;i<a.length;i++) {
			
		System.out.println(a[i] +" array @ position "+ i);
		}
            bsort(a);
		//after sorting 
		System.out.println("After Sorting Arrays elements and there respective position");
		for (int i=0;i<a.length;i++) {
			
		System.out.println(a[i] +" array @ position "+ i);
		}
	  }
	
	    static void bsort(int a[]) 
	{
		int temp=0;
		int n=a.length;
		System.out.println(n+" size of an array and in the sort loop");
		for (int i=0;i<n;i++)
		{
			for(int j=1;j<(n-1);j++)
			{
				if (a[j-1]>a[j])
				{
				//swap element	
				temp=a[j-1];
				a[j=1]=a[j];
				a[j]=temp;
				
				}
			}
		}
	}
}  