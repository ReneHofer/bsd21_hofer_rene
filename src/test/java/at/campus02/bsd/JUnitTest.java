package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing Calculator Implementation")
public class JUnitTest {
    private double value1;
    private double value2;
    private double result;



    @Test
    void testAdd() {
        value1=2;
        value2=3;
        result = Calculator.add(value1,value2);
        assertTrue(result == 5);

    }

    @Test
    void testAdd2() {
        value1 = -2;
        value2 = 6;
        result = value1+value2;
        assertEquals(result, Calculator.add(value1,value2));
    }

    @Test
    void testMinus() {
        value1=5;
        value2=3;
        result = Calculator.minus(value1,value2);
        assertTrue(result == 2);
    }
    @Test
    void testMinus2() {
        value1 = -2;
        value2 = 6;
        result = value1-value2;
        assertEquals(result, Calculator.minus(value1,value2));
    }
    @Test
    void testDivide() {
        value1 = 10;
        value2 = 5;
        result = Calculator.divide(value1,value2);
        assertTrue(result == 2);
    }
    @Test
    void testDivide2() {
        value1 = -2;
        value2 = 6;
        result = value1/value2;
        assertEquals(result, Calculator.divide(value1,value2));
    }
    @Test
    void testMultiply() {
        value1 = 2;
        value2 = 5;
        result = Calculator.multiply(value1,value2);
        assertTrue(result == 10);
    }
    @Test
    void testMultiply2() {
        value1 = -2;
        value2 = 6;
        result = value1/value2;
        assertEquals(result, Calculator.divide(value1,value2));
    }
}
