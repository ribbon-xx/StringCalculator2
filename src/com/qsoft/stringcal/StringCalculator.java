package com.qsoft.stringcal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else if (input.length() == 1) {
			return toInt(input);
		} else {
			return sumOfArray(toNumbersArray(input));
		}
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}

	private static int[] toNumbersArray(String input) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(input);
		int[] arrayInt = null;
		int i = 0;
		while (m.find()) {
			arrayInt[i] = toInt(input.substring(m.start(), m.end()));
			i++;
		}
		return arrayInt;
	}

	private static int sumOfArray(int[] input) {
		int sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;
	}
}
