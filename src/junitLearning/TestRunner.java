package junitLearning;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestUnit.class);
	
		for (Failure f : result.getFailures()) {
			System.out.println(f.toString());
		}
		
		System.out.println("Test case run count="+result.getRunCount());
		System.out.println("Fail Count="+result.getFailureCount());

		System.out.println("Test Cases Result="+result.wasSuccessful());
		System.out.println("Run Time="+result.getRunTime());
	
	}
}
