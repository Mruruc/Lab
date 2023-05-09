package com.mruruc;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortNoRecursion {


    public static <T extends Comparable<T>> int partition2(T[] arr, int first, int last) {
       // int middle = first + (last - first) / 2;
       // int middle = first;
        int middle = last - 1;

        T pivotValue = arr[middle];
        arr[middle] = arr[first];
        arr[first] = pivotValue;

        int i = last - 1;
        for (int j = last - 1; j > first; j--) {
            if (arr[j].compareTo(pivotValue) > 0) {
                T temp = arr[j];
                arr[j] = arr[i];
                arr[i--] = temp;
            }
        }

        T temp = arr[i];
        arr[i] = arr[first];
        arr[first] = temp;
        return i;
    }

    public static <T extends Comparable<T>> void quickSortNoRecursion(T[] arr, int first, int last) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(first, last));

        while (!stack.isEmpty()) {
            Pair<Integer, Integer> p = stack.pop();
            int from = p.first, to = p.second;

            while (to - from > 1) {
                int pivotIndex = partition2(arr, from, to);
                if (pivotIndex - from > to - pivotIndex - 1) {
                    stack.push(new Pair<>(from, pivotIndex));
                    from = pivotIndex + 1;
                } else {
                    stack.push(new Pair<>(pivotIndex + 1, to));
                    to = pivotIndex;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 7, 1, 8, 4, 9, 2, 6};
        quickSortNoRecursion(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static class Pair<K, V> {
        public K first;
        public V second;

        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
    }
}


