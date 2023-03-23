package com.Mruruc;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class BinarySearchTest {
    @Test
    void testSearchAsc() {
        int[] arr = {1, 3, 5, 7, 9};
        int element = 5;
        int expectedIndex = 2;
        int actualIndex = BinarySearch.search(arr, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testSearchDesc() {
        int[] arr = {9, 7, 5, 3, 1};
        int element = 5;
        int expectedIndex = 2;
        int actualIndex = BinarySearch.search(arr, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testSearchEmpty() {
        int[] arr = {};
        int element = 5;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.search(arr, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testSearchNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int element = 6;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.search(arr, element);
        assertEquals(expectedIndex, actualIndex);
    }

}
