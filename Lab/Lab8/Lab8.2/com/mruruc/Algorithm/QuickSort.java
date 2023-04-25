package com.mruruc.Algorithm;
import java.util.Collections;
import java.util.List;

public class QuickSort {

    public static <T extends Comparable<T>> int partition(List<T> list, int first, int last) {
        int middle = first + (last - first) / 2;
        Collections.swap(list, middle, first);

        int i = last - 1;
        for (int j = last - 1; j > first; j--) {
            //made change here
            if (list.get(j).compareTo(list.get(first)) >= 0) {
                Collections.swap(list, j, i--);
            }
        }
        Collections.swap(list, i, first);
        return i;
    }

    public static <T extends Comparable<T>> void quickSort(List<T> list, int first, int last) {
        if (first < last) {
            int pivot = partition(list, first, last);
            quickSort(list, first, pivot);
            quickSort(list, pivot + 1, last);
        }
    }

    // Overloaded method for easier use
    public static <T extends Comparable<T>> void quickSort(List<T> list) {
        quickSort(list, 0, list.size());
    }
}
