package com.mruruc.Algorithm;

import java.util.List;

public class ShellSort {

    public static <T extends Comparable<T>> void insertionSort(List<T> list, int first, int last, int gap) {
        int i = first;

        while (i + gap < last) {
            i += gap;
            int j = i;
            T v = list.get(j);

            while (j > first && list.get(j - gap).compareTo(v) >= 0) {
                list.set(j, list.get(j - gap));
                j -= gap;
            }

            list.set(j, v);
        }
    }

    public static <T extends Comparable<T>> void shellSort(List<T> list) {
        int[] gaps = { 701, 301, 132, 57, 23, 10, 4, 1 };

        for (int gap : gaps) {
            insertionSort(list, 0, list.size(), gap);
        }
    }
}
