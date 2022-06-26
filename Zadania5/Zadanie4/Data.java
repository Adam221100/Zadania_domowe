
package zadanie5.pkg4;
import java.util.Calendar;
import java.util.Date;

public class Data {
	Date date = new Date();
	protected void showDate(){
		System.out.printf("%tF\n", date);
	}
	protected void addWeek(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		date = cal.getTime();
	}
	protected void remWeek(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, -7);
		date = cal.getTime();
	}
}

