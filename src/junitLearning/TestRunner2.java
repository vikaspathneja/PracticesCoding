package junitLearning;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestRunner2 {
	public static void main(String[] args) {
		
		TestSuite ts=new TestSuite(TestUnit2.class,TestUnit.class);
		TestResult trs=new TestResult();
		ts.run(trs);
		System.out.println("run count="+trs.runCount());
		System.out.println("fail count="+trs.failureCount());


	}
}
