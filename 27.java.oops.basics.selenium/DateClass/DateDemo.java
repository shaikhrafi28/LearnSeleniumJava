package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateDemo a1 = new DateDemo();
		a1.defaultDate();
		a1.formattedDate();

	}

	public void defaultDate() {

		Date d = new Date();
		System.out.println(d);// default format

	}

	public void formattedDate() {

		Date d = new Date();

		SimpleDateFormat sd1 = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));

	}

}
