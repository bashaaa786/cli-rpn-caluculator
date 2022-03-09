package test.com.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.calculator.RPNCalculator;
/**
 * Test class to test all the functionality of RPNCalculator
 * @author Basha
 *
 */
public class RPNCalculatorTest {


	RPNCalculator rpnCalculator = new RPNCalculator();
    @Test
    void testAdd() throws Exception {
    	rpnCalculator.evaluateToken("7");
    	rpnCalculator.evaluateToken("4");
    	Assertions.assertEquals(11.0, rpnCalculator.evaluateToken("+"));
    }
    
    @Test
    void testSubtract() throws Exception {
        rpnCalculator.evaluateToken("10");
        rpnCalculator.evaluateToken("7");
        Assertions.assertEquals(3.0, rpnCalculator.evaluateToken("-"));
    }
    
    @Test
    void testMultiple() throws Exception {
        rpnCalculator.evaluateToken("10");
        rpnCalculator.evaluateToken("7");
        Assertions.assertEquals(70.0, rpnCalculator.evaluateToken("*"));
    }
    @Test
    void testDivision() throws Exception {
        rpnCalculator.evaluateToken("14");
        rpnCalculator.evaluateToken("7");
        Assertions.assertEquals(7.0, rpnCalculator.evaluateToken("/"));
    }
}
