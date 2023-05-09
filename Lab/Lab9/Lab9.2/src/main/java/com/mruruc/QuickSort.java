package com.mruruc;

public class QuickSort {
    public static <T extends Comparable<T>> int partition(T[] arr, int first, int last) {
        //int middle = first + (last - first) / 2;
        //int middle = first;
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

    public static <T extends Comparable<T>> void quickSort(T[] arr, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(arr, first, last);
            quickSort(arr, first, pivotIndex);
            quickSort(arr, pivotIndex + 1, last);
        }
    }
  /*  public static void sort(Integer[] arr, int start, int end) {

        if (start>=end) {
            return;
        }
        int pivotIndex=partition(arr,start,end);
        sort(arr,start,pivotIndex-1);
        sort(arr,pivotIndex+1,end);

    }

    private static int partition(Integer[] arr, int start, int end) {

        int pivot=arr[end];
        int counter=start;

        for (int i = start; i <end; i++) {
            if(arr[i]<=pivot){
                swap(arr,i,counter);
                counter++;
            }
        }
        swap(arr,counter,end);
        return counter;
    }

    private static void swap(Integer[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }*/
}
