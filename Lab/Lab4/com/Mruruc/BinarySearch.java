package com.Mruruc;

public class BinarySearch {

    public static int search(int[] arr, int element) {
        if (arr.length <= 0) {
            return -1;
        }
        int start = 0;
        int last = arr.length - 1;


        //ASC:
        if (arr[start]<arr[last]) {
            while (start <= last) {
                int middle = start + (last - start) / 2;
                if (arr[middle] == element) {
                    return middle;
                } else if (element > arr[middle]) {
                    start = middle + 1;
                } else {
                    last = middle - 1;
                }
            }
        } else {

            //DESC:
            while (start <= last) {
                int middle = start + ((last - start) / 2);
                if (arr[middle] == element) {
                    return middle;
                } else if (element > arr[middle]) {
                    last = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
