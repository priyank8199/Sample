package org.testexample;


import org.example.Calculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest extends Calculator {


        @Test
        public void testAddition() {
            assertEquals(5.0, Calculator.calculate(2, 3, '+'), 0.001);
        }

        @Test
        public void testSubtraction() {
            assertEquals(-1.0, Calculator.calculate(2, 3, '-'), 0.001);
        }

        @Test
        public void testMultiplication() {
            assertEquals(6.0, Calculator.calculate(2, 3, '*'), 0.001);
        }

        @Test
        public void testDivision() {
            assertEquals(2.0, Calculator.calculate(6, 3, '/'), 0.001);
        }




    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(2, 0, '/');
        });
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(2, 3, '%');
        });
    }


    }

