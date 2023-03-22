package com.Mruruc.FirstTask;

import com.Mruruc.FirstTask.Array;
import com.Mruruc.FirstTask.Divisor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisorTest {

    @Test
    public void testDivisor() {
        Array expected = new Array();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(10);
        expected.add(20);

        Array actual = Divisor.divisor(20);

        assertEquals(expected.getSize(), actual.getSize());
        for (int i = 0; i < expected.getSize(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}
