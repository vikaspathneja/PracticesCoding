package junitLearning;

import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUntiWithAnnot2 {

	@Test(expected = IndexOutOfBoundsException.class)
	public void myFirstTest() {
//		assertSame("first", "first");
		int x=10/0;
		System.out.println(x);
	}
	
	
	@Test(timeout = 1000)
	public void mySecondTest() {
		assertSame("first", "first");
	}
	
	@Before
	public void beforeTestCase() {
		System.out.println("before my test");
	}
	
	@After
	public void afterTestCase() {
		System.out.println("after my test");
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
