package SuperKeyword;

public class ChildClass1 extends ParentClass1 {
	//MAIN METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass1 cc1 = new ChildClass1();
		cc1.getStringData();

		cc1.getData();

	}
	// VARIABLE
	String name = "VEERAJ";
	
	// CONSTRUCTOR
	public ChildClass1() {
       // super();
		System.out.println("I am a  CONSTRUCTOR  in CHILD class");
	}

	// METHOD
	public void getStringData() {

		System.out.println(name);// Gives preference to local variable/child class
		System.out.println(super.name);// SUPER refers to the parent. When same variable exists in Parent & Child.
	}
	// METHOD
	public void getData() {

		super.getData();
		System.out.println("I am a  METHOD in Child class");

	}
}
