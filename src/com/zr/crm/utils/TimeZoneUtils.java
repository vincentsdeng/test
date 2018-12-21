package com.zr.crm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/**
 * 时区转换工具类�?
 * @author ljl
 *
 */
public class TimeZoneUtils {
	
	public static final String YYYY_MM_DD_HH_MM_SS2 = "yyyy/MM/dd HH:mm:ss";
	public static final String YYYY_MM_DD_HH_MM2 = "yyyy/MM/dd HH:mm";
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
	
	/**数据中心默认时区*/
	private static final String DATA_CETNER_TIME_ZONE="GMT+8";

	
	/**
	 * 将其它时区时间转换成标准时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @return
	 */
	public static String otherTimeZone2UCT(String sourceDate){
		String sourceTimeZone=DATA_CETNER_TIME_ZONE;
		String dstTimeZone="UCT";
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, null);
	}
	
	/**
	 * 将标准时间转换成GMT+8。暂时不处理夏令时问题�?<br>
	 * @param sourceDate
	 * @param 目标日期格式
	 * @return
	 */
	public static String uct2GMT8TimeZone(String sourceDate){
		String sourceTimeZone="UCT";
		String dstTimeZone=DATA_CETNER_TIME_ZONE;
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, null);
	}
	
	/**
	 * 将标准时间转换成其它时区时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @param 目标日期格式
	 * @return
	 */
	public static String uct2OtherTimeZone(Date sourceDate,String style){
		String sourceTimeZone="UCT";
		String dstTimeZone=DATA_CETNER_TIME_ZONE;
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, style);
	}
	
	/**
	 * 将标准时间转换成其它时区时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @param 目标日期格式
	 * @return
	 */
	public static String uct2OtherTimeZone(Date sourceDate, String dstTimeZone,String style){
		String sourceTimeZone="UCT";
		//String dstTimeZone=DATA_CETNER_TIME_ZONE;
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, style);
	}

	/**
	 * 将美国东部时间转换成标准时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @return
	 */
	public static String usaEastern2UCT(String sourceDate){
		String sourceTimeZone="GMT-4";
		String dstTimeZone="UCT";
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, null);
	}
	
	/**
	 * 北京时间转成标准时间
	 * @param sourceDate
	 * @param style
	 * @return
	 */
	public static String gmt82UCT(String sourceDate, String style){
		String sourceTimeZone="GMT+8";
		String dstTimeZone="UCT";
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, style);
	}
	/**
	 * 将标准时间转换成美国东部时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @return
	 */
	public static String uct2UsaEastern(String sourceDate){
		String sourceTimeZone="UCT";
		String dstTimeZone="GMT-4";
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, null);
	}

	/**
	 * 将标准时间转换成美国东部时间。暂时不处理夏令时问题�?
	 * @param sourceDate
	 * @param 目标日期格式
	 * @return
	 */
	public static String uct2UsaEastern(Date sourceDate,String style){
		String sourceTimeZone="UCT";
		String dstTimeZone="GMT-4";
		return convertTimeZone(sourceDate, sourceTimeZone, dstTimeZone, style);
	}
	
	/**
	 * 获取当前美国东部时间
	 * @return
	 */
	public static Date getUsaEastern(){
		TimeZone timeZoneLocal = Calendar.getInstance().getTimeZone();
    	TimeZone timeZoneUE = TimeZone.getTimeZone("GMT-4");		
    	int timeOffset = timeZoneLocal.getRawOffset() - timeZoneUE.getRawOffset();
    	Date d = new Date(new Date().getTime() - timeOffset);	
		return d;
	}	
	
	public static Date getUCT(){
		TimeZone timeZoneLocal = Calendar.getInstance().getTimeZone();
    	TimeZone timeZoneUE = TimeZone.getTimeZone("GMT0");		
    	int timeOffset = timeZoneLocal.getRawOffset() - timeZoneUE.getRawOffset();
    	Date d = new Date(new Date().getTime() - timeOffset);	
		return d;
	}
	/**
	 * 将指定时区的日期转换成目标时区的日期并返回�?
	 * @param sourceDate	  待转换的日期
	 * @param sourceTimeZone 待转换的日期时区
	 * @param dstTimeZone	目标时区
	 * @param dstStyle 输出目标日期格式
	 * @return 
	 */
	public static String convertTimeZone(String sourceDate, String sourceTimeZone, String dstTimeZone, String dstStyle) {
		if(sourceDate==null || sourceDate.trim().length()==0) return sourceDate;
		
    	TimeZone timeZoneSH = TimeZone.getTimeZone(sourceTimeZone);
    	TimeZone timeZoneNY = TimeZone.getTimeZone(dstTimeZone);
    	
    	SimpleDateFormat inputFormat = null;
    	inputFormat = getDateStyle(sourceDate);
    	inputFormat.setTimeZone(timeZoneSH);
    	Date date = null;
    	try{
    	    date = inputFormat.parse(sourceDate);
    	}catch (ParseException e){ 	}
    	         
    	SimpleDateFormat outputFormat = null;
    	if(dstStyle!=null){
    		outputFormat = new SimpleDateFormat(dstStyle);
    	} else{
			outputFormat = getDateStyle(sourceDate);
    	}
    	outputFormat.setTimeZone(timeZoneNY);
    	return outputFormat.format(date);
	}

	/**
	 * 返回输入日期的日期格�?
	 * @param sourceDate
	 * @return
	 */
	private static SimpleDateFormat getDateStyle(String sourceDate) {
		SimpleDateFormat inputFormat=null;
		if(sourceDate.trim().length()==16){
			if(sourceDate.indexOf("-")>0){
				inputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM);
			}else if(sourceDate.indexOf("/")>0){
				inputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM2);
			}
    	}else{
			if(sourceDate.indexOf("-")>0){
				inputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
			}else if(sourceDate.indexOf("/")>0){
				inputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS2);
			}
    	}
		return inputFormat;
	}
	
	/**
	 * 将指定时区的日期转换成目标时区的日期并返回�?
	 * @param sourceDate	  待转换的日期
	 * @param sourceTimeZone 待转换的日期时区
	 * @param dstTimeZone	目标时区
	 * @return 
	 */
	public static String convertTimeZone(Date sourceDate, String sourceTimeZone, String dstTimeZone) {
		SimpleDateFormat outputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		String date = outputFormat.format(sourceDate);
		return convertTimeZone(date, sourceTimeZone, dstTimeZone, null);
	}

	/**
	 * 将指定时区的日期转换成目标时区的日期并返回�?
	 * @param sourceDate	  待转换的日期
	 * @param sourceTimeZone 待转换的日期时区
	 * @param dstTimeZone	目标时区
	 * @return 
	 */
	public static String convertTimeZone(Date sourceDate, String sourceTimeZone, String dstTimeZone, String dstStyle) {
		SimpleDateFormat outputFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		String date = outputFormat.format(sourceDate);
		return convertTimeZone(date, sourceTimeZone, dstTimeZone, dstStyle);
	}

	/**
	 * 判断标准时间的日期是否与美国东部时间的日期为同一�?
	 * @param uctDate 美东时间
	 * @param gmtDate 标准时间
	 * @return
	 */
	public static boolean isSameUCTDate(Date uctDate,Date gmtDate){
		String uctstr = DateUtil.formatDate(uctDate);
		String temp = uct2UsaEastern(DateUtil.format(gmtDate,YYYY_MM_DD_HH_MM_SS));
		String gmtstr = DateUtil.formatDate(DateUtil.parseDate(temp));		
		return uctstr.equals(gmtstr);
	}	
	
	public static boolean isSameUCTDate(Date uctDate,String gmtDate){
		
		String uctstr = DateUtil.formatDate(uctDate);
		String temp = uct2UsaEastern(gmtDate);
		String gmtstr = DateUtil.formatDate(DateUtil.parseDate(temp));		
		return uctstr.equals(gmtstr);
	}
	
	/*public static void main(String[] args) {
		Date uct = DateUtil.parseDate("2014-08-27 00:00:00","yyyy-MM-dd HH:mm:ss");
		Date gmt = DateUtil.parseDate("2014-08-27 2:50:00","yyyy-MM-dd HH:mm:ss");
		System.out.println(isSameDate(uct,gmt));
	}*/
}
