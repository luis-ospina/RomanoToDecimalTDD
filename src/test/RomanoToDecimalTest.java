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
}
