package com.mruruc;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void sizeTest() {
        List list = new List();
        list.addFirst(2);
        list.addFirst(7);
        list.addFirst(0);
        list.addFirst(5);
        assertEquals(4, list.size2());
    }

    @Test
    public void size_Test_Zero_Element() {
        List list = new List();
        assertEquals(0, list.size2());
    }

    @Test
    public void exists_Test_Zero_Element() {
        List list = new List();
        assertFalse(list.exists(5));
    }

    @Test
    public void exists_Test_One_Element() {
        List list = new List();
        list.addFirst(5);
        assertTrue(list.exists(5));
    }

    @Test
    public void exists_Test_More_Element() {
        List list = new List();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(48);
        list.addFirst(14);
        list.addFirst(67);
        list.addFirst(91);
        assertTrue(list.exists(14));
    }



        @Test
        void testAddLastAndPopBack() {
            // Test adding elements to the list
            List list=new List();
            list.addLast(1);
            list.addLast(2);
            list.addLast(3);

            // Test the size of the list
            assertEquals(3, list.size());

            // Test popping elements from the list
            assertEquals(3, list.popBack());
            assertEquals(2, list.popBack());
            assertEquals(1, list.popBack());

            // Test the size of the list after popping elements
            assertEquals(0, list.size());
        }

        @Test
        void testPopBackEmptyList() {
            // Test popping from an empty list
            List list=new List();
            assertThrows(NoSuchElementException.class, () -> list.popBack());
        }
    }



