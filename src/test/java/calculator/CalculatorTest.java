package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(2.5, Calculator.add(0.5F, 2.0F), "there is no match with the expected value" );
    }

    @Test
    void subtract() {
        assertEquals(10.3, Calculator.subtract(19.7F, 30.0F), "there is no match with the expected value" );
    }

    @Test
    void divide() {
        assertEquals(2.0, Calculator.divide(40.0F, 20.0F), "there is no match with the expected value" );
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(20.3F, 0.0F), "with division by zero must be an exception");
    }

    @Test
    void multiply() {
        assertEquals(60.0, Calculator.multiply(30.0F, 2.0F),  "there is no match with the expected value" );
    }
}