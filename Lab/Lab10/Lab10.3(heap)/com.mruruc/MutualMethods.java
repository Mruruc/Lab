package com.mruruc.heap;

public class MutualMethods {
    protected int[] arr;
    protected int heap_Size;
    void swap(int index, int parent) {
        int temp= arr[index];
        arr[index]= arr[parent];
        arr[parent]=temp;
    }
    public int peek(){
        if(isEmpty()){
            throw new NullPointerException("Heap is Empty!");
        }
        return arr[0];
    }
    public boolean isFull(){
        return heap_Size== arr.length;
    }
    public boolean isEmpty(){
        return heap_Size==0;
    }
    public int getHeap_Size(){
        return this.heap_Size;
    }
     int parent(int index) {
        return (index-1)/2;
    }
    int rightChildIndex(int parentIndex){
       return  2*parentIndex+2;
    }
    int leftChildIndex(int parentIndex){
       return  2*parentIndex+1;
    }
    public void print(){
        for (int i = 0; i < heap_Size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean binarySearch(int element,int left,int right){
        if(isEmpty()){
            throw new NullPointerException("Heap is Empty!");
        }

        if(left<=right) {
            int middle = (left + right) / 2;

            if (arr[middle] == element) {
                return true;
            } else if (element > arr[middle]) {
                return binarySearch(element, left, middle - 1);
            } else if (element < arr[middle]) {
                return binarySearch(element, middle + 1, right);
            }
        }
        return false;
    }
    public boolean linearSearch(int element){
        if(isEmpty()){
            throw new NullPointerException("Heap is Empty!");
        }
        for (int i = 0; i < getHeap_Size(); i++) {
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }

}
