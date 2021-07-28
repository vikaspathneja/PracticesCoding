package junitLearning;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestUnit extends TestCase{
	private int value1;
	private int value2;
	
	@Test
	public void testString() {
		this.setName("CompareStringTestCase");
		System.out.println("testCase Name="+this.getName());
		String str="testing";
		assertSame("testing", str);
	}
	
	@Test
	public void testString2() {
		this.setName("CompareValueTestCase");
		System.out.println("testCase Name="+this.getName());
		assertEquals(value1+value2,20);
		assertEquals("testing",null);
	}
	
	@Test
	public void testString3() {

		this.setName("CheckNotNullTestCase");
		System.out.println("testCase Name="+this.getName());
		String str="testing";
		assertNotNull(str);
	}
	
	
	@Test
	public void testString4() {
		this.setName("CheckBooleanFalseTestCase");
		System.out.println("testCase Name="+this.getName());
		assertFalse(true);
	}
	
	
	@Override
	public int countTestCases() {
		return super.countTestCases();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		//super.tearDown();
		System.out.println("tear down");
	}
	
	@Override
	protected void setUp() throws Exception {
		System.out.println("executing setUp");
		value1=10;
		value2=10;
	}
}
