package CalenderClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calenderDemo cd = new calenderDemo();//Creating object
		cd.calender1();
		
		}

	
	public void calender1()
	
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sd2.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	}
	
	
	
	
}
