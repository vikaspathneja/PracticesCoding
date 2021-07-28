package junitLearning;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	JUntiWithAnnot.class,JUntiWithAnnot2.class
})
public class TestSuitCombine {
}
