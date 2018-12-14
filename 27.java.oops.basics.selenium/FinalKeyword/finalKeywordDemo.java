package FinalKeyword;

//CLASS  : final CLASS cannot be extended (Eg.finalclassDemo can not extend finalKeywordDemo)
final class finalKeywordDemo { // final CLASS : Prevent Inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VARIABLE : final variable cannot be re-assigned. CONSTANT
		final int i = 40;// final VARIABLE : To Create Constant Variables

		// i=5; //NOT POSSIBLE

	}

	// METHOD : A final method cannot be overridden
	final void getdata() // final METHOD : Prevent method overloading
	{

		System.out.println("Final Method");
		
	}

}
