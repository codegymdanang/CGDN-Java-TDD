import org.fest.assertions.Assert;
import org.fest.assertions.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
      calculator= new Calculator();
    }

    @AfterEach
    void tearDown() {
       calculator = null;
    }

    @Test
    public void testPlus2Number() {

        String input = "2,3";
        int expectedResult = 5;
        int actualResult =  calculator.cal(input);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlus3NumberReturnToLastValue () {
        String input = "1,2,3";
        int expectedResult = 5;
        int actual = calculator.cal(input);
        assertEquals(expectedResult,actual);
    }

    @Test
    public void testPlusIfemptyReturn0 () {
        String input = "";
        int expectedResult = 0;
        int actual = calculator.cal(input);
        assertEquals(expectedResult,actual);
    }
}