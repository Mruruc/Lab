package com.mruruc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class App {

        public static void main(String[] args) {
            // collection sizes
            Vector<Integer> s = new Vector<Integer>();
            s.addAll(Arrays.asList(2000, 5000, 10000, 15000, 20000, 30000, 40000, 50000));

            for (Integer n : s) {
                Integer[] v = new Integer[n];

                // generating collection contents (sorted)
                for (int i = 0; i < n; i++)
                    v[i] = i;

                long  start = System.nanoTime();
              //  QuickSort.quickSort(v, 0, v.length - 1);
                QuickSortNoRecursion.quickSortNoRecursion(v, 0, v.length - 1);
                long end = System.nanoTime();

                System.out.println(end-start);
            }
        }




 /*   public static void main(String[] args) {
        // collection sizes
        List<Integer> s = List.of(2000, 5000, 10000, 15000, 20000, 30000, 40000, 50000);

        for (int n : s) {
            List<Integer> v = new ArrayList<>();

            // generating collection contents (sorted)
            for (int i = 0; i < n; i++)
                v.add(i);

            Benchmark<Long> b = new Benchmark<>(TimeUnit.NANOSECONDS);
            QuickSort.quickSort(v);
            // QuickSortNoRecursion.quickSort(v);
            long t = b.elapsed();

            System.out.println(t);
        }
    }
}

class Benchmark<T> {
    private final TimeUnit timeUnit;
    private final long start;

    public Benchmark(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        this.start = System.nanoTime();
    }

    public T elapsed() {
        long end = System.nanoTime();
        long elapsed = end - start;
        return (T) timeUnit.convert(elapsed, TimeUnit.NANOSECONDS);
    }*/
}



