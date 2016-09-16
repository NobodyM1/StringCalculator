import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
	
	@Test
	public void testCorrectString() throws StringCalculatorException {
		StringCalculator test = new StringCalculator();
		int result = test.add("1\n2,3");
		assertEquals(result, 6);
	}
	
	@Test
	public void test_negativeNumber() throws StringCalculatorException {
		StringCalculator test = new StringCalculator();
		test.add("1\n2,3..-4");
		// Is supposed to fail
		
	}
	
	@Test
	public void test_NumberOverThousand() throws StringCalculatorException {
		StringCalculator test = new StringCalculator();
		int result = test.add("1\n2,3.1001");
		assertEquals(result, 6);
	}
	
	@Test
	public void test_AnyLenght() throws StringCalculatorException {
		StringCalculator test = new StringCalculator();
		int result = test.add("//[***]\n1***2***3");
		assertEquals(result, 6);
	}
	
	@Test
	public void test_MultipleDelimeters() throws StringCalculatorException {
		StringCalculator test = new StringCalculator();
		int result = test.add("//[*][%]\n1*2%3");
		assertEquals(result, 6);
	}

}
