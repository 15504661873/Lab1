package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab1Testb {
    private static Lab1 lab = new Lab1(100);
	@Before
	public void setUp() throws Exception {
		lab = lab.createDirectedGraph("myfile.txt");
	}

	@Test
	public void testGenerateNewText() {
		String result = lab.generateNewText(lab, "we dont talk anymore i a anymore we to be we dont love anymore");
		assertEquals("we dont talk anymore i am a anymore like we used to be we dont love anymore",result);
	}

}
