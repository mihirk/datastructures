package org.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void return0ForEmptyString() throws Exception {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void returnTheSameNumberIfOnlyOneNumberIsInput() throws Exception {
        assertEquals(1, calculator.add("1"));
        assertEquals(2, calculator.add("2"));
    }

    @Test
    public void returnSumOfTwoNumbersIf2NumbersAreInput() throws Exception {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void returnSumOf3NumbersIf3NumbersAreInput() throws Exception {
        assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void returnSumOf2NumbersIfTheyHaveSpaces() throws Exception {
        assertEquals(4, calculator.add("1 , 3"));
    }

    @Test
    public void returnSumOf2NumbersIfTheyHaveNewLines() throws Exception {
        assertEquals(4, calculator.add("1 ,\n3"));
    }
}
