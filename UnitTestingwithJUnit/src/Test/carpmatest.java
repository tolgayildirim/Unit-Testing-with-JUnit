package Test;

import Sinif.Islemlerim;
import junit.framework.TestCase;

public class carpmatest extends TestCase {


	private Islemlerim carp;
	protected void setUp() throws Exception {
		super.setUp();
		carp = new Islemlerim();
	}
	public void testim()
	{
		
		assertEquals(8,carp.carpmaislemi(4, 2));
	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		carp=null;
	}

}
