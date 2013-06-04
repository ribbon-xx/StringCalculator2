package com.qsoft.stringcal;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void return0OnEmptyStr() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void returnOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void returnSumOnTwoNumbersWithComma() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void returnSumOnThreeNumbersWithSpecialDelimiter() {
		assertEquals(6, StringCalculator.add("1,2#3"));
	}
}
