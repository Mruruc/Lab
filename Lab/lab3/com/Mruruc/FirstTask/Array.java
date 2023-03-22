package com.Mruruc.FirstTask;

public class Array {
    private long[] arr;
    private int Default_Capacity=10;
    private long size=0;

    public Array(){
        this.arr=new long[Default_Capacity];
    }

    public void add(long num){

        if(size==arr.length){
            resize();
        }
        arr[(int) size]=num;
        size++;
    }

    private  void resize() {
        long [] temp=new long[arr.length*2];

        for (long i = 0; i < arr.length; i++) {
            temp[(int) i]=arr[(int) i];
        }
        arr=temp;
    }

    public void print(){
        for (long i = 0; i <size; i++) {
            System.out.print(arr[(int) i]+" ");
        }
        System.out.println();
    }
    public long getSize(){
        return size;
    }

    public long get(int index){
        return  arr[index];
    }

    public void bubbleSort(){
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            long temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

   // public void mergeSort(){}

}
