package com.laoft.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ��¥ ���� �Լ� ����
 */
public class DateUtil {

	//��¥ ǥ�� �������� ������ ��������
	public static String getDate(String str) {
		SimpleDateFormat formatter = new SimpleDateFormat(str, Locale.KOREA);
		Date currentTime = new Date();
		String res = formatter.format(currentTime);

		return res;
	}
	
	//���� �� ��������
	public static String getTodayYYYY() {
		return getDate("yyyy");
		
	}
	
	//���� �� ��������
	public static String getTodayMM() {
		return getDate("MM");
		
	}
	
	//���� �� ��������
	public static String getTodayDD() {
		return getDate("dd");
		
	}
	
	

}
