package com.mruruc.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static <T extends Comparable<T>> void merge(List<T> list, int first, int middle, int last) {
        List<T> merged = new ArrayList<>();

        int i = first;
        int j = middle;

        while (i < middle && j < last) {
            //made change here
            if (list.get(i).compareTo(list.get(j)) <= 0) {
                merged.add(list.get(i++));
            } else {
                merged.add(list.get(j++));
            }
        }

        while (i < middle) {
            merged.add(list.get(i++));
        }

        while (j < last) {
            merged.add(list.get(j++));
        }

        for (i = first, j = 0; i < last; i++, j++) {
            list.set(i, merged.get(j));
        }
    }

    public static <T extends Comparable<T>> void mergeSort(List<T> list, int first, int last) {
        if (last - first > 1) {
            int middle = first + (last - first) / 2;
            mergeSort(list, first, middle);
            mergeSort(list, middle, last);
            merge(list, first, middle, last);
        }
    }

    // Overloaded method for easier use
    public static <T extends Comparable<T>> void mergeSort(List<T> list) {
        mergeSort(list, 0, list.size());
    }
}
