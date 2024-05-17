package com.mycompany.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author jory
 */

public class CalculatorTest {

    /**
     * Test of add method, of class Calculator.
     */
    
    @Test
    public void testAddPositiveNumbers() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 8.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); // delta added for double comparison
    }

    @Test
    public void testAddNegativeNumbers() {
        double num1 = -5.0;
        double num2 = -3.0;
        double expected = -8.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        double num1 = 5.0;
        double num2 = -3.0;
        double expected = 2.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testAddZero() {
        double num1 = 5.0;
        double num2 = 0.0;
        double expected = 5.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testAddZeroToZero() {
        double num1 = 0.0;
        double num2 = 0.0;
        double expected = 0.0;
        double result = Calculator.add(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

}


//    /**
//     * Test of subtract method, of class Calculator.
//     */
//    @Test
//    public void testSubtract() {
//        System.out.println("subtract");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        Calculator.subtract(num1, num2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of multiply method, of class Calculator.
//     */
//    @Test
//    public void testMultiply() {
//        System.out.println("multiply");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        Calculator.multiply(num1, num2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of divide method, of class Calculator.
//     */
//    @Test
//    public void testDivide() {
//        System.out.println("divide");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        Calculator.divide(num1, num2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//}
