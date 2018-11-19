package com.lp.share.util;

import org.apache.commons.lang.StringUtils;

import com.lp.share.base.BaseConstants;

public class LpStringUtils extends StringUtils {
	
	public static String nullToEmpty(String str) {
		if (isEmpty(str)) {
			return BaseConstants.SignCst.EMPTY;
		}
		return str;
	}
	
	public static String convertToString(Object obj) {
		if (obj == null) {
			return BaseConstants.SignCst.EMPTY;
		}
		return nullToEmpty(obj.toString());
	}
}
