package com.test.quartz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DailyTaskJob {
	
	protected void execute() {
		 //执行任务
		Calendar instance = Calendar.getInstance();
		Date time = instance.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = dateFormat.format(time);
		System.out.println("定时执行任务:"+format);
	}
}
