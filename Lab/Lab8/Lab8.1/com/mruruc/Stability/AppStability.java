package com.mruruc.Stability;

import com.mruruc.Algorithm.BubbleSort;
import com.mruruc.Algorithm.InsertionSort;
import com.mruruc.Algorithm.SelectionSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppStability {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 0));
        items.add(new Item(5, 1));
        items.add(new Item(7, 2));
        items.add(new Item(7, 3));
        items.add(new Item(3, 4));
        items.add(new Item(1, 5));

        System.out.println("Collection unsorted:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println();

        Item[] itemsArray = items.toArray(new Item[0]);
        Comparator<Item> comparator = Comparator.comparingInt(Item::getKey);

       // BubbleSort.bubbleSort(itemsArray, comparator);
     // InsertionSort.insertionSort(itemsArray, comparator);
      SelectionSort.selectionSort(itemsArray, comparator);

        System.out.println("Sorted collection:");
        for (Item item : itemsArray) {
            System.out.println(item);
        }
        System.out.println();
    }
}


