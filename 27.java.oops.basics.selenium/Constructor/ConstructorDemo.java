package Constructor;

public class ConstructorDemo {

	/*
	 * A constructor is a special method that is used to initialize a newly created
	 * object and is called just after the memory is allocated for the object. It
	 * can be used to initialize the objects to desired values or default values at
	 * the time of object creation. It is not mandatory for the coder to write a
	 * constructor for a class
	 */

	public ConstructorDemo() // Default Constructor

	{

		System.out.println("I am in the Default constructor");

		System.out.println("I am in the Default constructor1");

	}

	public ConstructorDemo(int a, int b) // Paremeterized Constructor

	{

		System.out.println("I am in the Paremeterized constructor");

	}

	public ConstructorDemo(String str) // Paremeterized Constructor 2

	{

		System.out.println(str);

	}

	public void method1()

	{

		System.out.println("I am a method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Whenever you create/instantiate an object,constructor is called.
		ConstructorDemo cd = new ConstructorDemo();

		ConstructorDemo cd1 = new ConstructorDemo(4, 5);

		ConstructorDemo cd2 = new ConstructorDemo("I am in the Paremeterized constructor 2");
	}

}
