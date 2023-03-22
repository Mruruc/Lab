package com.Mruruc;

import java.util.Arrays;

public class FillArray {

    /*
    * Filling a two-dimensional array with consequtive integers.
    In the example, the array is filled with rows from left to right.
    We start filling in from the top left corner.

     Example for the array 3 x 4:

       1   2   3   4
       5   6   7   8
       9  10  11  12
   */

    public static void fillArray1(int[][] arr) {
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, counter++) {
                arr[i][j] = counter;
            }
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void DIAG_DOWN(int[][] arr) {
        /*   7   4   2   1
             10   8   5   3
             12  11   9   6
             */


        int firstValue = 1;
        int m, n;


        for (int t = 0; t < 4; t++) {
            m = 0;
            n = t;
            while (n >= 0 && m < 3) {
                arr[m][n] = firstValue;
                firstValue++;
                m++;
                n--;
            }
        }

        for (int t = 1; t < 3; t++) {
            m = t;
            n = 3;
            while (n >= 0 && m < 3) {
                arr[m][n] = firstValue;
                firstValue++;
                m++;
                n--;
            }
        }
  }


    public static void DIAG_UP(int[][] arr) {
        /*10  13  15  16
          6   9  12  14
          3   5   8  11
          1   2   4   7*/


    }


    public static void SSW_HOR(int[][] arr) {
      /*16  15  14  13
        9  10  11  12
        8   7   6   5
        1   2   3   4*/


        int num = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (i % 2 == 0) {
                    arr[i][j] = num;
                } else {
                    arr[i][arr.length - 1 - j] = num;
                }
                num++;
            }
        }
    }

    public static void NW_VER(int[][] arr) {

             /* 1   8   9  16
               2   7  10  15
               3   6  11  14
               4   5  12  13*/

        int num = 1;
        int row = 0;
        int col = 0;
        boolean goingDown = true;

        while (num <= arr.length * arr[0].length) {
            arr[row][col] = num;
            num++;


            if (goingDown) {
                if (row == arr.length - 1) {
                    col++;
                    goingDown = false;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    col++;
                    goingDown = true;
                } else {
                    row--;
                }
            }
        }
    }



    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        DIAG_DOWN(arr);
        FillArray.print(arr);
    }
}
