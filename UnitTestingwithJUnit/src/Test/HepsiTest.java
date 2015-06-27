package Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HepsiTest extends TestCase {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test Hepsi");
		//$JUnit-BEGIN$
		suite.addTestSuite(bolmetest.class);
		suite.addTestSuite(carpmatest.class);
		suite.addTestSuite(cikarmatest.class);
		suite.addTestSuite(toplamatest.class);
		suite.addTestSuite(toplamatest2.class);		

		
		//$JUnit-END$
		return suite;
	}

}