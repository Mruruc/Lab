package com.Mruruc.SecondTask;

import com.Mruruc.FirstTask.Array;
import org.junit.Test;
import static org.junit.Assert.*;

public class TweakDivisorTest {

    @Test
    public void testTweakDivisor() {
        // Test tweakDivisor method with different inputs
        Array expected1 = new Array();
        expected1.add(2);
        expected1.add(4);
        expected1.add(5);
        expected1.add(10);
        expected1.add(20);
        expected1.add(25);
        expected1.add(50);
        expected1.add(100);
        expected1.add(125);
        expected1.add(250);
        expected1.add(500);
        expected1.add(1000);
        expected1.add(1250);
        expected1.add(2500);
        expected1.add(5000);
        Array actual1 = TweakDivisor.tweakDivisor(10000);
        assertArrayEquals(expected1, actual1);

        Array expected2 = new Array();
        expected2.add(2);
        expected2.add(5);
        expected2.add(10);
        expected2.add(25);
        expected2.add(50);
        expected2.add(125);
        expected2.add(250);
        expected2.add(625);
        expected2.add(1250);
        expected2.add(3125);
        expected2.add(6250);
        expected2.add(15625);
        expected2.add(31250);
        expected2.add(78125);
        expected2.add(156250);
        Array actual2 = TweakDivisor.tweakDivisor(390625);
        assertArrayEquals(expected2, actual2);
    }

    private void assertArrayEquals(Array expected, Array actual) {
        assertEquals(expected.getSize(), actual.getSize());
        for (int i = 0; i < expected.getSize(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

}
