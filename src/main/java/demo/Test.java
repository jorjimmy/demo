package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		System.out.println(retStrFormatDate());
		
	}

	public static String retStrFormatDate(){
		 Date nowTime = new Date(System.currentTimeMillis());
		 Calendar calendar = Calendar.getInstance();  
	     calendar.setTime(nowTime);  
	     calendar.add(Calendar.DAY_OF_MONTH, -1);  
	     Date date = calendar.getTime();
	     SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	     String retStrFormatNowDate = sdFormatter.format(date);
		 return retStrFormatNowDate;
	}
}
