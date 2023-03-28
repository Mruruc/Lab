package com.Mruruc;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void testPush() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        assertEquals(3, buffer.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushFullBuffer() {
        CircularBuffer buffer = new CircularBuffer();
        for (int i = 0; i < 11; i++) {
            buffer.push(i);
        }
    }

    @Test
    public void testPop() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        int poppedElement = buffer.pop();
        assertEquals(1, poppedElement);
        assertEquals(2, buffer.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopEmptyBuffer() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.pop();
    }

    @Test
    public void testSize() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        assertEquals(3, buffer.size());
    }

    @Test
    public void testIsEmpty() {
        CircularBuffer buffer = new CircularBuffer();
        assertTrue(buffer.isEmpty());
        buffer.push(1);
        assertFalse(buffer.isEmpty());
    }

    @Test
    public void testPrintBuffer() {
        CircularBuffer buffer = new CircularBuffer();
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        buffer.printBuffer();
    }
}
