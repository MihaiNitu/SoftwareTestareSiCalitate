package TestCompanie;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import proiectCTS.Companie;
import proiectCTS.VizitatorMediu;
import proiectCTS.VizitatorSimplu;


public class TestCompanie extends TestCase{

	Companie cmp = new Companie("SA");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inainte de toate->");
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Dupa toate!");
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test_calculeaza() {
		VizitatorSimplu vs = new VizitatorSimplu();
		int rez = vs.calculeaza(0);
		assertEquals(0, rez);
	}

	@Test
	public void test_calculeaza2(){
		VizitatorMediu vs1 = new VizitatorMediu();
		int proces = vs1.calculeaza(-1);
		assertEquals(-1,proces);
	}
	
	@Test
	public void test_calculeaza3(){
		VizitatorMediu vs2 = new VizitatorMediu();
		int proces1 = vs2.calculeaza(123123123);
		assertEquals(123123123,proces1);
	}
	
	@Test
	public void testTip(){
		assertTrue(cmp.checkTip());
	}
	
}
	


