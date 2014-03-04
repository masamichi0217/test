package org.seasar.example.s2container.helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

	public SimpleDateFormat format;
	
	public String format(Date date){
		
		//SimpleDateFormatにはformatっていうメソッドがある。名前に注意。
		System.out.println( format.format(date));
		return format.format(date);
	}
}
