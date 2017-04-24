package genes;

import org.junit.*;
import static org.junit.Assert.*;

public class ApplicationTest {

	@Test
	public void alleleTest() {
		Allele allele1 = new Allele("rhesus", true);
		assertEquals("rhesus", allele1.name);
		assertEquals(true, allele1.a_value);
	}
	
	@Test
	public void geneTest() {
		
	}
	
}