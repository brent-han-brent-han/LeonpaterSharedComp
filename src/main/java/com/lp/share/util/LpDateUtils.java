package com.lp.share.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;

import com.lp.share.base.BaseConstants;
import com.lp.share.base.DateConstants;

public class LpDateUtils {

	/** Convert to java.util.Date */
	public static java.util.Date toUtilDate(Object source) {
		return toUtilDate(source, false);
	}
	public static java.util.Date toUtilDate(Object source, boolean lenient) {
		if (source instanceof java.util.Date) {
			return (java.util.Date) source;
		}
		if (source instanceof java.sql.Date) {
			return toUtilDate((java.sql.Date)source);
		}
		if (source instanceof String) {
			return toUtilDate((String) source, lenient);
		}
		return null;
	}

	/** Convert to java.sql.Date */
	public static java.util.Date toSqlDate(Object source) {
		return toSqlDate(source, false);
	}
	public static java.util.Date toSqlDate(Object source, boolean lenient) {
		if (source instanceof java.util.Date) {
			return toSqlDate((java.util.Date)source);
		}
		if (source instanceof java.sql.Date) {
			return (java.util.Date) source;
		}
		if (source instanceof String) {
			return toSqlDate((String) source, lenient);
		}
		return null;
	}
	
	/** Convert to String Date */
	public static String toStringDate(Object source, String pattern) {
		return toStringDate(source, pattern, false);
	}
	public static String toStringDate(Object source, String pattern, boolean lenient) {
		if (source instanceof java.util.Date || source instanceof java.sql.Date) {
			SimpleDateFormat simpleDateFormat = getSimpleDateFormat(pattern, lenient);
			return simpleDateFormat.format(source);
		}
		if (source instanceof String) {
			return toStringDate((String) source, pattern, lenient);
		}
		return BaseConstants.SignCst.BLANK;
	}
	
	/** Convert to String Date extend */
	/** yyyMMdd */
	public static String toStringDateYyyyMmDd(Object source, String pattern) {
		return toStringDate(source, DateConstants.PATTERN.PATTERN_YYYYMMDD.getPattern());
	}
	/** yyyy-MM-dd */
	public static String toStringDateYyyyUmmUdd(Object source, String pattern) {
		return toStringDate(source, DateConstants.PATTERN.PATTERN_YYYY_MM_DD.getPattern());
	}
	/** yyyy/MM/dd */
	public static String toStringDateYyyySmmSdd(Object source, String pattern) {
		return toStringDate(source, DateConstants.PATTERN.PATTERN_YYYY_S_MM_S_DD.getPattern());
	}
	
	/** get SimpleDateFormat */
	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		return getSimpleDateFormat(pattern, false);
	}
	public static SimpleDateFormat getSimpleDateFormat(String pattern, boolean lenient) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		simpleDateFormat.setLenient(lenient);
		return simpleDateFormat;
	}
	
	/** From date get SimpleDateFormat */
	public static String getPattern(String source) {
		for (DateConstants.PATTERN pattern : DateConstants.PATTERN.values()) {
			if (source.matches(pattern.getRgex())) {
				return pattern.getPattern();
			}
		}
		return null;
	}
	
	private static java.util.Date toUtilDate(java.sql.Date source) {
		if (source == null) {
			return null;
		}
		return new java.util.Date(source.getTime());
	}
	private static java.util.Date toUtilDate(String source, boolean lenient) {
		if (StringUtils.isEmpty(source)) {
			return null;
		}
		String pattern = getPattern(source);
		if (pattern == null) {
			return null;
		}
		SimpleDateFormat simpleDateFormat = getSimpleDateFormat(pattern, lenient);
		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static java.sql.Date toSqlDate(java.util.Date source) {
		if (source == null) {
			return null;
		}
		return new java.sql.Date(source.getTime());
	}
	private static java.sql.Date toSqlDate(String source, boolean lenient) {
		if (LpStringUtils.isEmpty(source)) {
			return null;
		}
		String pattern = getPattern(source);
		if (LpStringUtils.isEmpty(pattern)) {
			return null;
		}
		
		SimpleDateFormat simpleDateFormat = getSimpleDateFormat(pattern);
		try {
			return toSqlDate(simpleDateFormat.parse(source));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	private static String toStringDate(String source, String pattern, boolean lenient) {
		java.util.Date utilDate = toUtilDate(source, lenient);
		if (utilDate == null) {
			return BaseConstants.SignCst.BLANK;
		}
		SimpleDateFormat simpleDateFormat = getSimpleDateFormat(pattern, lenient);
		return simpleDateFormat.format(utilDate);
	}
}
