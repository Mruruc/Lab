package com.mruruc.Stability;

import com.mruruc.Algorithm.MergeSort;
import com.mruruc.Algorithm.QuickSort;
import com.mruruc.Algorithm.ShellSort;

import java.util.ArrayList;
import java.util.List;


public class AppStability {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        // Filling the list with specific values {key, value}
        items.add(new Item(10, 0));
        items.add(new Item(5, 1));
        items.add(new Item(10, 2));
        items.add(new Item(2, 3));
        items.add(new Item(3, 4));
        items.add(new Item(1, 5));

        // Displaying the collection before sorting
        System.out.println("Collection unsorted:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();

        // Sorting the collection
        //MergeSort.mergeSort(items);
        //QuickSort.quickSort(items);
         ShellSort.shellSort(items);

        // Displaying the collection after sorting
        System.out.println("Sorted collection:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();
    }
}
