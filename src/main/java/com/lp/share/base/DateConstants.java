package com.lp.share.base;

public class DateConstants {
	
	public static enum PATTERN {
		PATTERN_YYYY_MM_DD("^\\d{4}(\\-){1}\\d{2}(\\-){1}\\d{2}$", "yyyy-MM-dd"),
		PATTERN_YYYY_M_D("^\\d{4}(\\-){1}\\d{1}(\\-){1}\\d{1}$", " yyyy-M-d"),
		PATTERN_YYYY_M_DD("^\\d{4}(\\-){1}\\d{1}(\\-){1}\\d{2}$", "yyyy-M-dd"),
		PATTERN_YYYY_MM_D("^\\d{4}(\\/){1}\\d{2}(\\/){1}\\d{1}$", "yyyy-MM-d"),
		PATTERN_YYYY_S_MM_S_DD("^\\d{4}(\\/){1}\\d{2}(\\/){1}\\d{2}$", "yyyy/MM/dd"),
		PATTERN_YYYY_S_M_S_D("^\\d{4}(\\/){1}\\d{1}(\\/){1}\\d{1}$", " yyyy/M/d"),
		PATTERN_YYYY_S_M_S_DD("^\\d{4}(\\/){1}\\d{1}(\\/){1}\\d{2}$", "yyyy/M/dd"),
		PATTERN_YYYY_S_MM_S_D("^\\d{4}(\\/){1}\\d{2}(\\/){1}\\d{1}$", "yyyy/MM/d"),
		PATTERN_YYYY_P_MM_P_DD("^\\d{4}(\\.){1}\\d{2}(\\.){1}\\d{2}$", "yyyy.MM.dd"),
		PATTERN_YYYY_P_M_P_D("^\\d{4}(\\.){1}\\d{1}(\\.){1}\\d{1}$", "yyyy.M.d"),
		PATTERN_YYYY_P_M_P_DD("^\\d{4}(\\.){1}\\d{1}(\\.){1}\\d{2}$", "yyyy.M.dd"),
		PATTERN_YYYY_P_MM_P_D("^\\d{4}(\\.){1}\\d{2}(\\.){1}\\d{1}$", "yyyy.MM.d"),
		PATTERN_YYYYMMDD("^\\d{4}\\d{2}\\d{2}$", "yyyyMMdd"),
		PATTERN_YYYYMD("^\\d{4}\\d{1}\\d{1}$", "yyyyMd"),
		PATTERN_YYYYMDD("^\\d{4}\\d{1}\\d{2}$", "yyyyMdd"),
		PATTERN_YYYYMMD("^\\d{4}\\d{2}\\d{1}$", "yyyyMMd"),
		PATTERN_YYMMDD("^\\d{2}\\d{2}\\d{2}$", "yyMMdd"),
		PATTERN_YYMD("^\\d{2}\\d{1}\\d{1}$", "yyMd"),
		PATTERN_YYMDD("^\\d{2}\\d{1}\\d{2}$", "yyMdd"),
		PATTERN_YYMMD("^\\d{2}\\d{2}\\d{1}$", "yyMMd"),
		PATTERN_YY_S_MM_S_DD("^\\d{2}(\\/){1}\\d{2}(\\/){1}\\d{2}$", "yy/MM/dd"),
		PATTERN_YY_S_M_S_D("^\\d{2}(\\/){1}\\d{1}(\\/){1}\\d{1}$", "yy/M/d"),
		PATTERN_YY_S_M_S_DD("^\\d{2}(\\/){1}\\d{1}(\\/){1}\\d{2}$", "yy/M/dd"),
		PATTERN_YY_S_MM_S_D("^\\d{2}(\\/){1}\\d{2}(\\/){1}\\d{1}$", "yy/MM/d"),
		PATTERN_YY_P_MM_P_DD("^\\d{2}(\\.){1}\\d{2}(\\.){1}\\d{2}$", "yy.MM.dd"),
		PATTERN_YY_P_M_P_D("^\\d{2}(\\.){1}\\d{1}(\\.){1}\\d{1}$", "yy.M.d"),
		PATTERN_YY_P_M_P_DD("^\\d{2}(\\.){1}\\d{1}(\\.){1}\\d{2}$", "yy.M.dd"),
		PATTERN_YY_P_MM_P_D("^\\d{2}(\\.){1}\\d{2}(\\.){1}\\d{1}$", "yy.MM.d");

		private final String rgex;
		private final String pattern;

		private PATTERN(final String rgex, final String pattern) {
			this.rgex = rgex;
			this.pattern = pattern;
		}

		@Override
		public String toString() {
			return rgex + " " + rgex;
		}
		public String getRgex() {
			return rgex;
		}
		public String getPattern() {
			return pattern;
		}
	}
}
