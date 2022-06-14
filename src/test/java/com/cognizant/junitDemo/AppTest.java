package com.cognizant.junitDemo;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	@Test
	public void test1() {
		App app = new App();
		int num = app.add(1,1);
		int result = 3;
		assertEquals(num,result);
		
		
	}
	@Test
	public void test2() {
		App app = new App();
		int num = app.sub(1,1);
		int result = 1;
		assertEquals(num,result);
		
		
	}
	@Test
	public void test3() {
		App app = new App();
		int num = app.mul(1,1);
		int result = 1;
		assertEquals(num,result);
		
		
	}
	@Test
	public void test4() {
		App app = new App();
		int num = app.div(4,2);
		int result = 3;
		assertEquals(num,result);
		
		
	}
}
