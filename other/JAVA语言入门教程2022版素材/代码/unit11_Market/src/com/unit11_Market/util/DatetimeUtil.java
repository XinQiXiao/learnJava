package com.unit11_Market.util;

import java.sql.Timestamp;

public class DatetimeUtil {
	//��ȡ��ǰ����ʱ��
	public static Timestamp getNow() {
		//��ȡ��ǰʱ���1970�������
		long t=System.currentTimeMillis();
		Timestamp ts=new Timestamp(t);
		return ts;
	}
	
}




