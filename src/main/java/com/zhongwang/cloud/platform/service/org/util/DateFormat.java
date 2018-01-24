package com.zhongwang.cloud.platform.service.org.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-27 17:00
 */
public class DateFormat {
	
	private static final Logger logger = LoggerFactory.getLogger(DateFormat.class);
	
	/**
	 * 年
	 */
	public static final String DATE_YYYY = "yyyy";
	
	/**
	 * 年月
	 */
	public static final String DATE_YYYYMM = "yyyyMM";
	
	/**
	 * 年月日
	 */
	public static final String DATE_YYYYMMDD = "yyyyMMdd";
	
	/**
	 * 年月日时(12小时制)
	 */
	public static final String DATE_12_YYYYMMDDHH = "yyyyMMddhh";
	
	/**
	 * 年月日时分(12小时制)
	 */
	public static final String DATE_12_YYYYMMDDHHMM = "yyyyMMddhhmm";
	
	/**
	 * 年月日时分秒(12小时制)
	 */
	public static final String DATE_12_YYYYMMDDHHMMSS = "yyyyMMddhhmmss";
	
	/**
	 * 年月日时分秒(12小时制)
	 */
	public static final String DATE_12_YYYYMMDDHHMMSSSSS = "yyyyMMddhhmmssSSS";
	
	/**
	 * 年月日时(24小时制)
	 */
	public static final String DATE_24_YYYYMMDDHH = "yyyyMMddHH";
	
	/**
	 * 年月日时分(24小时制)
	 */
	public static final String DATE_24_YYYYMMDDHHMM = "yyyyMMddHHmm";
	
	/**
	 * 年月日时分秒(24小时制)
	 */
	public static final String DATE_24_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	
	/**
	 * 年月日时分秒毫秒(24小时制)
	 */
	public static final String DATE_24_YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
	
	/**
	 * 年-月
	 */
	public static final String DATE_YYYY_MM = "yyyy-MM";
	
	/**
	 * 年-月-日
	 */
	public static final String DATE_YYYY_MM_DD = "yyyy-MM-dd";
	
	/**
	 * 年-月-日 时(24小时制)
	 */
	public static final String DATE_24_YYYY_MM_DD_HH = "yyyy-MM-dd HH";
	
	/**
	 * 年-月-日 时:分(24小时制)
	 */
	public static final String DATE_24_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
	
	/**
	 * 年-月-日 时:分:秒 (24小时制)
	 */
	public static final String DATE_24_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 年-月-日 时:分:秒 毫秒(24小时制)
	 */
	public static final String DATE_24_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss SSS";
	
	/**
	 * 年-月-日 时(12小时制)
	 */
	public static final String DATE_12_YYYY_MM_DD_HH = "yyyy-MM-dd hh";
	
	/**
	 * 年-月-日 时:分(12小时制)
	 */
	public static final String DATE_12_YYYY_MM_DD_HH_MM = "yyyy-MM-dd hh:mm";
	
	/**
	 * 年-月-日 时:分:秒 (12小时制)
	 */
	public static final String DATE_12_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd hh:mm:ss";
	
	/**
	 * 年-月-日 时:分:秒 毫秒(12小时制)
	 */
	public static final String DATE_12_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd hh:mm:ss SSS";
	
	/**
	 * 年/月
	 */
	public static final String DATE_SLASH_YYYY_MM = "yyyy/MM";
	
	/**
	 * 年/月/日
	 */
	public static final String DATE_SLASH_YYYY_MM_DD = "yyyy/MM/dd";
	
	/**
	 * 年/月/日 时(24小时制)
	 */
	public static final String DATE_24_SLASH_YYYY_MM_DD_HH = "yyyy/MM/dd HH";
	
	/**
	 * 年/月/日 时:分(24小时制)
	 */
	public static final String DATE_24_SLASH_YYYY_MM_DD_HH_MM = "yyyy/MM/dd HH:mm";
	
	/**
	 * 年/月/日 时:分:秒 (24小时制)
	 */
	public static final String DATE_24_SLASH_YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd HH:mm:ss";
	
	/**
	 * 年/月/日 时:分:秒 毫秒(24小时制)
	 */
	public static final String DATE_24_SLASH_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy/MM/dd HH:mm:ss SSS";
	
	/**
	 * 年/月/日 时(12小时制)
	 */
	public static final String DATE_12_SLASH_YYYY_MM_DD_HH = "yyyy/MM/dd hh";
	
	/**
	 * 年/月/日 时:分(12小时制)
	 */
	public static final String DATE_12_SLASH_YYYY_MM_DD_HH_MM = "yyyy/MM/dd hh:mm";
	
	/**
	 * 年/月/日 时:分:秒 (12小时制)
	 */
	public static final String DATE_12_SLASH_YYYY_MM_DD_HH_MM_SS = "yyyy/MM/dd hh:mm:ss";
	
	/**
	 * 年/月/日 时:分:秒 毫秒(12小时制)
	 */
	public static final String DATE_12_SLASH_YYYY_MM_DD_HH_MM_SS_SSS = "yyyy/MM/dd hh:mm:ss SSS";
	
	/**
	 * 月
	 */
	public static final String DATE_MONTH = "MM";
	
	/**
	 * 天
	 */
	public static final String DATE_DAY = "dd";
	
	/**
	 * 时 (24 小时制)
	 */
	public static final String DATE_24_HOUR = "HH";
	
	/**
	 * 时:分 (24 小时制)
	 */
	public static final String DATE_24_HH_MM = "HH:mm";
	
	/**
	 * 时:分:秒 (24 小时制)
	 */
	public static final String DATE_24_HH_MM_SS = "HH:mm:ss";
	
	/**
	 * 时:分:秒 毫秒 (24 小时制)
	 */
	public static final String DATE_24_HH_MM_SS_SSS = "HH:mm:ss SSS";
	
	/**
	 * 时 (12 小时制)
	 */
	public static final String DATE_12_HOUR = "hh";
	
	/**
	 * 时:分 (12 小时制)
	 */
	public static final String DATE_12_HH_MM = "hh:mm";
	
	/**
	 * 时:分:秒 (12 小时制)
	 */
	public static final String DATE_12_HH_MM_SS = "hh:mm:ss";
	
	/**
	 * 时:分:秒 毫秒 (12 小时制)
	 */
	public static final String DATE_12_HH_MM_SS_SSS = "hh:mm:ss SSS";
	
	/**
	 * 分种
	 */
	public static final String DATE_MINUTE = "mm";
	
	/**
	 * 秒
	 */
	public static final String DATE_SECOND = "ss";
	
	/**
	 * 毫秒
	 */
	public static final String DATE_MILLISECOND = "SSS";
	
	/**
	 * 星期中的天数
	 */
	public static final String DATE_WEEK = "E";
	
	/**
	 * 两位年月日 yyMMdd
	 */
	public static final String DATE_YY_MM_DD = "yyMMdd";
	
	/**
	 * string to Date
	 *
	 * @param dateString
	 * @param pattern
	 * @return Date
	 */
	public static Date parseStringToDate(String dateString, String pattern) {
		Date parse = null;
		if (StringUtils.isEmpty(dateString)) {
			return parse;
		}
		try {
			parse = new SimpleDateFormat(pattern).parse(dateString);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return parse;
	}
	
	/**
	 * format Date To String
	 *
	 * @param date
	 * @param pattern
	 * @return String
	 */
	public static String formatDateToString(Date date, String pattern) {
		if (null == date) {
			return null;
		}
		return new SimpleDateFormat(pattern).format(date);
	}
	
}
