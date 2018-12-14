package Inheritance;

public class Son extends GrandFather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Son s = new Son();
	s.city(); //INHERITANCE-METHOD
	s.country();//INHERITANCE-METHOD
	System.out.println(s.i);//INHERITANCE-VARIABLE
	}
	
	
	public void activities () {
		System.out.println("Singing");
	}
	
	
	
}
