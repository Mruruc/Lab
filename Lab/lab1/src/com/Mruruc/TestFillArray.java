package com.Mruruc;

import static org.junit.jupiter.api.Assertions.*;

public class TestFillArray {

    @org.junit.jupiter.api.Test
    public void testFillArray() {
        int[][] arr = new int[3][4];
        FillArray.fillArray1(arr);

        assertEquals(1, arr[0][0]);
        assertEquals(2, arr[0][1]);
        assertEquals(3, arr[0][2]);
        assertEquals(4, arr[0][3]);

        assertEquals(5, arr[1][0]);
        assertEquals(6, arr[1][1]);
        assertEquals(7, arr[1][2]);
        assertEquals(8, arr[1][3]);

        assertEquals(9, arr[2][0]);
        assertEquals(10, arr[2][1]);
        assertEquals(11, arr[2][2]);
        assertEquals(12, arr[2][3]);
    }

    @org.junit.jupiter.api.Test
    public void testSSWHOR() {
        int[][] arr = new int[][]{{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        FillArray.SSW_HOR(arr);
        assertArrayEquals(new int[][]{{16, 15, 14, 13},
                {9, 10, 11, 12},
                {8, 7, 6, 5},
                {1, 2, 3, 4}}, arr);
    }

    @org.junit.jupiter.api.Test
    public void testNWVER() {
        int[][] arr = new int[][]{{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        FillArray.NW_VER(arr);
        assertArrayEquals(new int[][]{{1, 8, 9, 16},
                {2, 7, 10, 15},
                {3, 6, 11, 14},
                {4, 5, 12, 13}}, arr);
    }

    @org.junit.jupiter.api.Test
    public void testDIAG_DOWN() {
        int[][] arr = new int[3][4];
        FillArray.DIAG_DOWN(arr);

        int[][] expected = {{7, 4, 2, 1}, {10, 8, 5, 3}, {12, 11, 9, 6}};
        assertArrayEquals(expected, arr);
    }

}