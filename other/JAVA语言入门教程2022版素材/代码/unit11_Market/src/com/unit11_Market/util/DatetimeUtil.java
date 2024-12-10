package com.unit11_Market.util;

import java.sql.Timestamp;

public class DatetimeUtil {
	//获取当前日期时间
	public static Timestamp getNow() {
		//获取当前时间和1970年毫秒数
		long t=System.currentTimeMillis();
		Timestamp ts=new Timestamp(t);
		return ts;
	}
	
}




