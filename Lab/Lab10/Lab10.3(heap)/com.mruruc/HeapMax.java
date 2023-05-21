package com.mruruc.heap;

import java.util.ArrayList;

public class HeapMax extends MutualMethods{

    public HeapMax(int maxSize) {
        this.arr = new int[maxSize];
        this.heap_Size = 0;
    }

    //O(logn) Time Complexity due to start swapping node that inserted to root;
    public void insert(int element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full!");
        }
        heap_Size++;
        int index = heap_Size - 1;
        arr[index] = element;

        while (index != 0 && arr[index] > arr[parent(index)]){
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void heapify(int index) {

        int largestIndex = index;
        int left = leftChildIndex(index);
        int right = rightChildIndex(index);

        // If left child is larger than root
        if (left <heap_Size && arr[left] > arr[largestIndex]) {
            largestIndex = left;
        }

        // If right child is larger than largest so far
        if (right < heap_Size && arr[right] > arr[largestIndex]) {
            largestIndex = right;
        }

        // If largest is not the root
        if (largestIndex != index) {
            swap(index, largestIndex);
            // Recursively heapify the affected sub-tree
            heapify(largestIndex);
        }

    }
    public void delete(int index) {
        if (index < 0 || index >= heap_Size) {
            throw new IllegalArgumentException("No such index number!");
        }

        helper(index, Integer.MAX_VALUE);

        if (arr[0] == Integer.MAX_VALUE) {
            extractMax();
        } else {
            heapify(index);
        }
    }

    private void helper(int index, int maxValue) {
        arr[index] = maxValue;
        while (index != 0 && arr[index] > arr[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }


    public int extractMax(){
        if(isEmpty()){
            throw new NullPointerException("Heap is Empty!");
        }
        int max=peek();
        arr[0]=arr[heap_Size-1];
        heap_Size--;
        heapify(0);
        return max;
    }
    public void update(int index, int element) {
        if (index < 0 || index >= heap_Size) {
            throw new IllegalArgumentException("No such index number!");
        }

        if (isEmpty()) {
            throw new NullPointerException("Heap is Empty!");
        }

        int oldValue = arr[index];
        arr[index] = element;

        if (element > oldValue) {
            // The new element is larger, so it may need to move up the tree
            while (index != 0 && arr[parent(index)] < arr[index]) {
                swap(index, parent(index));
                index = parent(index);
            }
        } else {
            // The new element is smaller, so it may need to move down the tree
            heapify(index);
        }
    }

    public ArrayList<Integer> heapSortDESC(){
        ArrayList<Integer> list=new ArrayList<>();
        int originalHeapSize= getHeap_Size();
        for (int i = 0; i <originalHeapSize; i++) {
            int removed=extractMax();
            list.add(removed);
        }
        return list;
    }



    //O(n) Time Complexity due to heapify tree from last second level to root!

  /*  public void insert(int element) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full!");
        }
        heap_Size=heap_Size+1;
        int index=heap_Size-1;

        arr[index] = element;

        for (int i = heap_Size/ 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }*/

}
