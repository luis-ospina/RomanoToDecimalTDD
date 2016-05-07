package test;

import org.junit.Test;

import main.RomanoToDecimal;
import junit.framework.TestCase;

public class RomanoToDecimalTest extends TestCase {
	RomanoToDecimal test = new RomanoToDecimal();
	
	@Test
	public void test() {
		int decimal = test.romanoDecimal("I");
		assertEquals(1,decimal);
	}
	
	@Test
	public void test2() {
		int decimal = test.romanoDecimal("II");
		assertEquals(2,decimal);
	}
	
	@Test
	public void test3() {
		int decimal = test.romanoDecimal("III");
		assertEquals(3,decimal);
	}
	
	@Test
	public void test4() {
		int decimal = test.romanoDecimal("IV");
		assertEquals(4,decimal);
	}
	
	@Test
	public void test5() {
		int decimal = test.romanoDecimal("V");
		assertEquals(5,decimal);
	}
	
	@Test
	public void test8() {
		int decimal = test.romanoDecimal("VIII");
		assertEquals(8,decimal);
	}
	
	@Test
	public void test9() {
		int decimal = test.romanoDecimal("IX");
		assertEquals(9,decimal);
	}
	
	@Test
	public void test10() {
		int decimal = test.romanoDecimal("X");
		assertEquals(10,decimal);
	}
	
	@Test
	public void test15() {
		int decimal = test.romanoDecimal("XV");
		assertEquals(15,decimal);
	}
	
	@Test
	public void test25() {
		int decimal = test.romanoDecimal("XXV");
		assertEquals(25,decimal);
	}
	
	@Test
	public void test39() {
		int decimal = test.romanoDecimal("XXXIX");
		assertEquals(39,decimal);
	}
	
	
}
