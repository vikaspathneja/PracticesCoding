package junitLearning;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizedCheckerTester {
	private int no;
	private boolean value;
//	private int no2;
		
	
	public ParametrizedCheckerTester(int no,boolean value,int no2) {
		this.no=no;
		this.value=value;
//		this.no2=no2;
	}	
	@Parameters
	public static Collection getSampleDataArray() {
		 return Arrays.asList(new Object[][] {
	         { 2, true ,1},
	         { 6, false,1 },
	         { 19, true,1 },
	         { 22, false,1 },
	         { 23, true,1 }
	      });				
	}
	
	
	
	@Test
	public void test() {
		assertEquals(true,isEvenNumber(no));
	}
	
	private boolean isEvenNumber(final int no) {
		if(no%2==0)
			return true;
			else
				return false;
	}
	
	
	
	
}
