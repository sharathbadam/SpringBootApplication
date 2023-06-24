package org.example;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */

public class AppTest
{
    /**
     * Rigorous Test :-)
     */

    @Autowired
    Calculation calc;

    @Test
    public void AddTwoNumbers()
    {
        long expectedSum = 10;
        long actualSum = calc.add(4,6);
        assertEquals(expectedSum, actualSum);

    }

    @Test
    public void AddTwoNumbersFail()
    {
        long expectedSum = 11;
        long actualSum = calc.add(4,6);
        assertNotEquals(expectedSum, actualSum);

    }


}