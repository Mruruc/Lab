package com.mruruc.heap;

import java.util.ArrayList;

public class HeapMin extends MutualMethods{
    public HeapMin(int maxSize){
        this.arr=new int[maxSize];
        this.heap_Size =0;
    }

    public void insert(int element){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is Full!");
        }
         heap_Size++;
         int index= heap_Size -1;
         arr[index]=element;
                               // parent      >   child
         while(index!=0 && arr[parent(index)] > arr[index]){
             swap(index,parent(index));
             index=parent(index);
         }
    }

    public int extractMin() {
        if(isEmpty()){
            throw new NullPointerException("Heap is Empty!");
        }
        int root = arr[0];
        arr[0] = arr[heap_Size - 1];
        heap_Size--;
        minHeapify(0);
        return root;
    }

    private void minHeapify(int parentIndex) {
        if(getHeap_Size()==1){
            return;
        }

        int leftChildIndex= leftChildIndex(parentIndex);
        int rightChildIndex= rightChildIndex(parentIndex);
        int smallerElementIndex=parentIndex;

        if(leftChildIndex<heap_Size
                && arr[leftChildIndex] <arr[parentIndex])
        {
            smallerElementIndex=leftChildIndex;
        }
        if(rightChildIndex<heap_Size
                && arr[rightChildIndex]<arr[smallerElementIndex])
        {
            smallerElementIndex=rightChildIndex;
        }
        if(smallerElementIndex != parentIndex){
            swap(parentIndex,smallerElementIndex);
            minHeapify(smallerElementIndex);
        }
    }

    public void delete(int index) {
        if(index>getHeap_Size() || index<0){
            throw new IllegalArgumentException("Not valid index!");
        }
        helpToDelete(index, Integer.MIN_VALUE);

        if (arr[0] == Integer.MIN_VALUE) {
            extractMin();
        } else {
            minHeapify(index);
        }
    }

    private void helpToDelete(int index, int minValue) {
        arr[index]=minValue;
        while(index!=0 && arr[parent(index)] > arr[index]){
            swap(index,parent(index));
            index=parent(index);
        }
    }

    public int update(int index, int newElement) {
        if(index>getHeap_Size() || index<0){
            throw new IllegalArgumentException("Not valid index!");
        }
        int elementChanged = arr[index];
        arr[index] = newElement;

        if (newElement < elementChanged) {
            // The new element is smaller, so it may need to move up the tree
            while (index != 0 && arr[parent(index)] > arr[index]) {
                swap(index,parent(index));
                index =parent(index);
            }
        } else {
            // The new element is larger, so it may need to move down the tree
            minHeapify(index);
        }

        return elementChanged;
    }

    public ArrayList<Integer> heapSortASC() {
        ArrayList<Integer> sortedList = new ArrayList<>();
        int originalHeapSize = heap_Size;

        for (int i = 0; i < originalHeapSize; i++) {
            int min = extractMin();
            sortedList.add(min);
        }

        return sortedList;
    }

}


