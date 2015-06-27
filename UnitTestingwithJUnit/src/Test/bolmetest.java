package Test;

import Sinif.Islemlerim;
import junit.framework.TestCase;

public class bolmetest extends TestCase {


	private Islemlerim bol;
	protected void setUp() throws Exception {
		super.setUp();
		bol = new Islemlerim();
	}
	public void testim()
	{
		
		assertEquals(2,bol.bolmeislemi(4, 2));
	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		bol=null;
	}

}
