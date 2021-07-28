package junitLearning;

import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUntiWithAnnot {

	@Test
	public void myFirstTest() {
		assertSame("first", "first");
	}
	
	
	@Test
	public void mySirstTest() {
		assertSame("first", "first");
	}
	
	@Before
	public void beforeMyFirstTest() {
		System.out.println("before my first test");
	}
	
	@After
	public void afterMyFirstTest() {
		System.out.println("after my first test");
	}
	
	@BeforeClass
	   public static void beforeClass() {
	      System.out.println("in before class");
	   }

	   //execute after class
	   @AfterClass
	   public static void  afterClass() {
	      System.out.println("in after class");
	   }
	
	

}
