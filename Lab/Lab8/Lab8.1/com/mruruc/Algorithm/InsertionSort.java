package com.mruruc.Algorithm;

import java.util.Comparator;

public class InsertionSort {
    public static <T> void insertionSort(T[] array, Comparator<T> comparator) {
        if (array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; ++i) {
            int j = i;
            T value = array[j];
            //made change on this line
            while (j > 0 && comparator.compare(array[j - 1], value) > 0) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = value;
        }
    }
}
