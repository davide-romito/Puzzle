package com.davideromito.spotify;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseBinaryNumbersTest {
	ReverseBinaryNumbers rbn;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		rbn = new ReverseBinaryNumbers();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverse() {
		assertEquals(11, rbn.reverse(13));
		assertEquals(61, rbn.reverse(47));
	}

}
