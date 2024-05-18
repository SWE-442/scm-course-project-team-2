
import com.mycompany.calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCase1() {
        // Normal Division
        double num1 = 10;
        double num2 = 2;
        double expected = 5.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        // Division by zero
        double num1 = 10;
        double num2 = 0;
        double expected = Double.NaN;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        // Division Resulting in a Fraction
        double num1 = 3;
        double num2 = 4;
        double expected = 0.75;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        // Division of a Negative Number
        double num1 = -15;
        double num2 = 3;
        double expected = -5.0;
        double result = Calculator.divide(num1, num2);
        assertEquals(expected, result);
    }
}
