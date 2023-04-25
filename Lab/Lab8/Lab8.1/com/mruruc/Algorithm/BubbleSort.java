package com.mruruc.Algorithm;

import java.util.Comparator;

public class BubbleSort {
    public static <T> void bubbleSort(T[] array, Comparator<T> comparator) {
        if (array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; ++i) {
            boolean sorted = true;
            for (int j = array.length - 1; j >= i; --j) {
                if (comparator.compare(array[j], array[j - 1]) < 0) {
                    swap(array, j, j - 1);
                    sorted = false;
                }
            }
            if (sorted) {
                return;
            }
        }
    }

    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
