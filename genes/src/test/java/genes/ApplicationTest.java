package genes;

import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

public class ApplicationTest {
	
	@Autowired

	@Test
	public void alleleTest() {
		Allele allele1 = new Allele("rhesus", true);
		assertEquals("rhesus", allele1.name);
		assertEquals(true, allele1.a_value);
	}
	
	@Test
	public void geneTestNeg() {
		Gene first = new Gene(
			new Allele("rhesus", false),
			new Allele ("rhesus", false));
		assertEquals(false, first.geneValue());
	}	
	
	@Test
	public void geneTestPos() {
		Gene first = new Gene(
			new Allele("rhesus", true),
			new Allele ("rhesus", false));
		assertEquals(true, first.geneValue());
	}
	
}