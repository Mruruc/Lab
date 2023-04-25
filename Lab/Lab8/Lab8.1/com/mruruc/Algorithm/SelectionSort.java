package com.mruruc.Algorithm;

import java.util.Comparator;

public class SelectionSort {
    public static <T> void selectionSort(T[] array, Comparator<T> comparator) {
        if (array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length - 1; ++i) {
            int lowestIndex = findLowest(array, i, array.length, comparator);
            if (lowestIndex != i) {
                swap(array, lowestIndex, i);
            }
        }
    }

    private static <T> int findLowest(T[] array, int first, int last, Comparator<T> comparator) {
        int lowestIndex = first;
        for (int i = first + 1; i < last; ++i) {

            if (comparator.compare(array[i], array[lowestIndex]) <= 0) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    private static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
