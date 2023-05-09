package com.mruruc;

import java.util.Arrays;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector<Integer> s = new Vector<Integer>();
        s.addAll(Arrays.asList(2000, 5000, 10000, 15000, 20000, 30000, 40000, 50000,
                100000,150000,200000,300000,
                400000,500000));

        for (Integer n : s) {
            Integer[] v = new Integer[n];

            // generating collection contents (sorted)
            for (int i = 0; i < n; i++)
                v[i] = (int) (Math.random()*100);

            long  start = System.nanoTime();

            //BubbleSort.bubbleSortASC(v);
             // InsertionSort.insertionSort(v);
           //  SelectionSort.selectionSort(v);
           // MergeSort.sort(v,0,v.length);
            // QuickSort.quickSort(v,0,v.length);
             Arrays.sort(v);

            long end = System.nanoTime();

            System.out.println(end-start);
        }


    }
}
