package test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

import logic.MyApplication;

public class TestPessimisticCoverageExample {

	@Test
	public void testMyApplication() throws ParseException {
		MyApplication ma = new MyApplication();

		// Passing in the wrong format. 12 hour clock instead of 24
		boolean result = ma.isDepartureDate("25/03/2020 8:00 PM");

		assertEquals(true, result);

	}
}
