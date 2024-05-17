
package com.mycompany.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 
  @author jouf_alouthah

 */
public class CalculatorTest {
   
    @Test
    public void testSubtractPositiveNumbers() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expected = 2.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testSubtractNegativeNumbers() {
        double num1 = -5.0;
        double num2 = -3.0;
        double expected = -2.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testSubtractPositiveAndNegativeNumbers() {
        double num1 = 5.0;
        double num2 = -3.0;
        double expected = 8.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testSubtractZero() {
        double num1 = 5.0;
        double num2 = 0.0;
        double expected = 5.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }

    @Test
    public void testSubtractZeroFromZero() {
        double num1 = 0.0;
        double num2 = 0.0;
        double expected = 0.0;
        double result = Calculator.subtract(num1, num2);
        assertEquals(expected, result, 0.0001); 
    }
}

