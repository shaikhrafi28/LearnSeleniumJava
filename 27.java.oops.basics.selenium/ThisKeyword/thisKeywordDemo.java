package ThisKeyword;

public class thisKeywordDemo {

	int a = 2;// GLOBAL VARIABLE

	public void getdata() {

		int a = 3;// LOCAL VARIABLE

		System.out.println(a);// refers to local variable
		System.out.println(this.a);// refers to global variable

		// this referes to current object and the object scope lies in the class level.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordDemo obj1 = new thisKeywordDemo();
		obj1.getdata();

	}

}
