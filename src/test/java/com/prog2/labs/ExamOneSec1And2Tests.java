package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class ExamOneSec1And2Tests {

	@Test
	void minWindowTest1() {
		String actual = ExamOneSec1And2.minWindow("qploresinazxrhqknhoilerthf", "lion");
		String expected = "nhoil";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void minWindowTest2() {
		String actual = ExamOneSec1And2.minWindow("catdgopheeszxmnqdphgdpoanmkey", "poem");
		String expected = "poanmke";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void minWindowTest3() {
		String actual = ExamOneSec1And2.minWindow("MKWPLNHNNKLASOPQLRHLI", "HILL");
		String expected = "LRHLI";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void minWindowTest4() {
		String actual = ExamOneSec1And2.minWindow("pr,P o. ,lorp .,Pr", "pro.");
		String expected = "orp .";
		
		assertEquals(expected, actual);
	}
}