package com.Mruruc;

import java.util.Arrays;
import java.util.Iterator;

public class BinarySearchWithIterator {

    public static void main(String[] args) {
        Integer[] arr={3,5,12,34,59,61,73,99};
        System.out.println(search(arr,12));

    }

    public static int search(Integer[] arr,int element){
        Iterator<Integer> iterator= Arrays.stream(arr).iterator();
        int start=0;
        int last= arr.length-1;
        while(iterator.hasNext()){
            int middle = start + ((last - start) / 2);
            if (arr[middle] == element) {
                return middle;
            } else if (element > arr[middle]) {
                start = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return -1;
    }
}
