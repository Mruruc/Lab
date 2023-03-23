package com.Mruruc;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class FindTrivalTest {

    @Test
    public void testLinearSearch() {
        int[] arr = {1, 5, 7, 9, 12};
        int element = 7;
        int expectedIndex = 2;
        int actualIndex =FindTravial.linearSearch(arr, element);
        assertEquals(expectedIndex, actualIndex);

        int[] emptyArr = {};
        int emptyElement = 3;
        int expectedEmptyIndex = -1;
        int actualEmptyIndex = FindTravial.linearSearch(emptyArr, emptyElement);
        assertEquals(expectedEmptyIndex, actualEmptyIndex);

        int[] arr2 = {4, 6, 8, 10, 12};
        int element2 = 5;
        int expectedIndex2 = -1;
        int actualIndex2 = FindTravial.linearSearch(arr2, element2);
        assertEquals(expectedIndex2, actualIndex2);

        int[] arr3 = {2, 2, 3, 3, 3};
        int element3 = 3;
        int expectedIndex3 = 2;
        int actualIndex3 = FindTravial.linearSearch(arr3, element3);
        assertEquals(expectedIndex3, actualIndex3);
    }
}
