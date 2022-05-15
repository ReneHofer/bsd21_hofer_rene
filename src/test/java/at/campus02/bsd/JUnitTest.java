package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Calculator Implementations")
public class JUnitTest {
    private double value1;
    private double value2;
    private double result;
    Calculator test;

    @BeforeEach
    void setUp() {
        test = new Calculator();
    }




    @Test
    void testAdd() {
        value1=2;
        value2=3;
        result = test.add(value1,value2);
        assertTrue(result == 5);

    }

    @Test
    void testAdd2() {
        value1 = -2;
        value2 = 6;
        result = value1+value2;
        assertEquals(result, test.add(value1,value2));
    }

    @Test
    void testMinus() {
        value1=5;
        value2=3;
        result = test.minus(value1,value2);
        assertTrue(result == 2);
    }
    @Test
    void testMinus2() {
        value1 = -2;
        value2 = 6;
        result = value1-value2;
        assertEquals(result, test.minus(value1,value2));
    }
    @Test
    void testDivide() {
        value1 = 10;
        value2 = 5;
        result = test.divide(value1,value2);
        assertTrue(result == 2);
    }
    @Test
    void testDivide2() {
        value1 = -2;
        value2 = 6;
        result = value1/value2;
        assertEquals(result, test.divide(value1,value2));
    }
    @Test
    void testMultiply() {
        value1 = 2;
        value2 = 5;
        result = test.multiply(value1,value2);
        assertTrue(result == 10);
    }
    @Test
    void testMultiply2() {
        value1 = -2;
        value2 = 6;
        result = value1/value2;
        assertEquals(result, test.divide(value1,value2));
    }

    @Test
    void testFactorial() {
        value1 = 5;
        result = 2*3*4*5;
        assertEquals(result, test.factorial((int) value1));

    }
    @Test
    void testFactorial2() {
        value1 = -2;
        assertNotEquals(-2, value1);
    }
    @Test
    void testFactorial3() {
        value1 =3;
    result= test.factorial((int) value1);
    assertTrue(result== 6);
    }
}
