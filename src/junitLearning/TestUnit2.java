package junitLearning;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUnit2 extends TestCase{
	@Test
	public void testString5() {
		System.out.println("testString5");
		String str="new";
		assertSame("new", str);
	}
	
	
	@Test
	public void testString6() {
		System.out.println("testString6");
		String str="newnew";
		assertSame("newnew", str);
	}
	

}
