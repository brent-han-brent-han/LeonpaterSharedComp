package com.lp.share.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang.math.NumberUtils;

public class LpNumberUtils extends NumberUtils {
	private static Object lhsClone = 4;
	private static Object rhsClone = 3;
	
	public static BigDecimal add(Object numA, Object numB) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = getInt(lhsClone);
		int rhsCloneA = getInt(rhsClone);
		BigDecimal add = rhsA.add(rhsB);
		BigDecimal ret = add.setScale(lhsCloneA, rhsCloneA);
		return ret;
	}

	public static BigDecimal add(Object numA, Object numB, Object scale, Object rm) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		int rhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		if (rm == null || LpStringUtils.convertToString(rm).replaceAll("\\s+|,|", "").trim().isEmpty()) {
			rhsCloneA = getInt(rhsClone);
		} else {
			rhsCloneA = getInt(rm);
		}

		BigDecimal add = rhsA.add(rhsB);
		BigDecimal ret = add.setScale(lhsCloneA, rhsCloneA);

		return ret;
	}


	public static BigDecimal add(Object numA, Object numB, Object scale) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		int rhsCloneA = getInt(rhsClone);
		BigDecimal add = rhsA.add(rhsB);
		BigDecimal ret = add.setScale(lhsCloneA, rhsCloneA);

		return ret;
	}

	public static BigDecimal subtract(Object numA, Object numB) {

		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = getInt(lhsClone);
		int rhsCloneA = getInt(rhsClone);
		BigDecimal subtract = rhsA.subtract(rhsB);
		BigDecimal ret = subtract.setScale(lhsCloneA, rhsCloneA);
		return ret;

	}

	public static BigDecimal subtract(Object numA, Object numB, Object scale, Object rm) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		int rhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		if (rm == null || LpStringUtils.convertToString(rm).replaceAll("\\s+|,|", "").trim().isEmpty()) {
			rhsCloneA = getInt(rhsClone);
		} else {
			rhsCloneA = getInt(rm);
		}

		BigDecimal subtract = rhsA.subtract(rhsB);
		BigDecimal ret = subtract.setScale(lhsCloneA, rhsCloneA);

		return ret;

	}

	public static BigDecimal subtract(Object numA, Object numB, Object scale) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		int rhsCloneA = getInt(rhsClone);
		BigDecimal subtract = rhsA.subtract(rhsB);
		BigDecimal ret = subtract.setScale(lhsCloneA, rhsCloneA);

		return ret;
	}

	public static BigDecimal multiply(Object numA, Object numB) {

		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = getInt(lhsClone);
		int rhsCloneA = getInt(rhsClone);
		BigDecimal multiply = rhsA.multiply(rhsB);
		BigDecimal ret = multiply.setScale(lhsCloneA, rhsCloneA);
		return ret;
	}

	public static BigDecimal multiply(Object numA, Object numB, Object scale, Object rm) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		int rhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		if (rm == null || LpStringUtils.convertToString(rm).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
			rhsCloneA = getInt(rhsClone);
		} else {
			rhsCloneA = getInt(rm);
		}

		BigDecimal multiply = rhsA.multiply(rhsB);
		BigDecimal ret = multiply.setScale(lhsCloneA, rhsCloneA);

		return ret;

	}

	public static BigDecimal multiply(Object numA, Object numB, Object scale) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		int rhsCloneA = getInt(rhsClone);
		BigDecimal multiply = rhsA.multiply(rhsB);
		BigDecimal ret = multiply.setScale(lhsCloneA, rhsCloneA);

		return ret;

	}

	public static BigDecimal divide(Object numA, Object numB) {
		int lhsCloneA = getInt(lhsClone);
		int rhsCloneA = getInt(rhsClone);
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		BigDecimal divide = rhsA.divide(rhsB, lhsCloneA, rhsCloneA);
		return divide;

	}

	public static BigDecimal divide(Object numA, Object numB, Object scale, Object rm) {
		Boolean errFlg = false;
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int scaleA = getInt(scale);
		int rmA = getInt(rm);
		java.math.RoundingMode.valueOf(rmA);
		BigDecimal ret = null;
		if (rhsB.compareTo(BigDecimal.ZERO) == 0) {
			errFlg = true;
		}
		if (errFlg) {
			// TODO
			return null;
		}
		BigDecimal divide = rhsA.divide(rhsB, scaleA, rmA);
		ret = divide;
		return ret;
	}

	public static BigDecimal divide(Object numA, Object numB, Object scale) {
		BigDecimal rhsA = getBigDecimal(numA);
		BigDecimal rhsB = getBigDecimal(numB);
		int lhsCloneA = 0;
		if (scale == null || LpStringUtils.convertToString(scale).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
			lhsCloneA = getInt(lhsClone);
		} else {
			lhsCloneA = getInt(scale);
		}
		int rhsCloneA = getInt(rhsClone);
		BigDecimal ret = rhsA.divide(rhsB, lhsCloneA, rhsCloneA);
		return ret;

	}

	public static BigDecimal getBigDecimal(Object value) {

		BigDecimal ret = BigDecimal.ZERO;
		try {
			if (value == null || LpStringUtils.convertToString(value).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
				return ret;
			}
			if (value instanceof BigDecimal) {
				ret = (BigDecimal) value;
			}
			if (value instanceof String) {
				value = ((String) value).replaceAll("\\s+|,|　", "").trim();
				ret = new BigDecimal((String) value);
			}
			if (value instanceof BigInteger) {

				ret = new BigDecimal((BigInteger) value);
			}
			if (value instanceof Number) {
				ret = new BigDecimal(((Number) value).doubleValue());
			}
		} catch (Exception e) {
			throw new ClassCastException(value + "");
		}
		return ret;
	}

	public static int getInt(Object value) {
		int ret = 0;
		try {
			if (value == null || LpStringUtils.convertToString(value).replaceAll("\\s+|,|　", "").trim().isEmpty()) {
				return ret;
			}
			if (value instanceof BigDecimal) {
				ret = Integer.parseInt(String.valueOf(value));
			}
			if (value instanceof String) {
				value = ((String) value).replaceAll("\\s+|,|　", "").trim();
				ret = Integer.parseInt((String) value);
			}
			if (value instanceof BigInteger) {
				ret = Integer.parseInt(String.valueOf((BigInteger) value));
			}
			if (value instanceof Number) {
				ret = ((Number) value).intValue();
			}
		} catch (NumberFormatException e) {
			throw new ClassCastException(value + "");
		}
		return ret;
	}
}
