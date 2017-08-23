package com.jll.dayeight;

import com.jll.dayeight.ConvertException;

public class Conveter {
	// 将字符串转化为整数，如果转换失败，抛出ConvetException异常。
	public int convertInt(String number) throws ConvertException {
		int num=0;
		try {
			num= Integer.parseInt(number);
			return num;
		} catch (Exception e) {
			throw new ConvertException(number+"不能转换为整数");
		}
	}
	public double convertDouble(String number) throws ConvertException {
		try {
			return Double.valueOf(number);
		} catch (Exception e) {
			throw new ConvertException(number + "不能转换为double");
		}
	}

	public float convertFloat(String number) throws ConvertException {
		try {
			return Float.valueOf(number);
		} catch (Exception e) {
			throw new ConvertException(number + "不能转换为Float");
		}
	}

	public short convertShort(String number) throws ConvertException {
		try {
			return Short.valueOf(number);
		} catch (Exception e) {
			throw new ConvertException(number + "不能转换为Short");
		}
	}

	public byte convertByte(String number) throws ConvertException {
		try {
			return Byte.valueOf(number);
		} catch (Exception e) {
			throw new ConvertException(number + "不能转换为Byte");
		}
	}
}
