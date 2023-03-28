package com.Mruruc;

public class CircularBuffer {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int index = 0;
    private int last = 0;
    private int counter = 0;
    private boolean isEmpty = true;

    public CircularBuffer() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void push(int element) {
        if (size() < arr.length) {
            arr[last] = element;
            last = (last + 1) % arr.length;
            counter++;
            isEmpty = false;
        } else {
            throw new ArrayIndexOutOfBoundsException("Buffer out of bounds!");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Buffer is empty");
        }
        int poppedElement = arr[index];
        arr[index] = 0;
        index = (index + 1) % arr.length;
        counter--;
        isEmpty = (counter == 0);
        return poppedElement;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void printBuffer() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
