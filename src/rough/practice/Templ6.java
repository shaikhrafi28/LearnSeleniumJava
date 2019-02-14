package rough.practice;

import java.util.Arrays;

public class Templ6
{
	public static void main(String[] args) {
		int numbers[]={1,-100,300,2,4,6,7,8,9000,7766,-99,23244};
		findLargestnSmallestNo(numbers);
	}
	
	public static void findLargestnSmallestNo(int a[]){
	    
	    int largest = a[0];
	    int smallest = a[0];
	    
	    for(int i=1;i<a.length;i++){
	        if(a[i]>largest){
	            largest = a[i];}
	            else if(a[i]<smallest){
	                smallest = a[i];
	            }
	        
	        }
	       
	       System.out.println("Given Array is" + Arrays.toString(a) );
	       System.out.println("Largest number is" + largest);
	       System.out.println("Smallest Number is " + smallest);
	    }
	    
	}
