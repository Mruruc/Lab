package com.mruruc;

import java.util.NoSuchElementException;

public class List {
    private Node head;
    private Node tail;
    private int counter;

    public List() {
        this.head = null;
        this.tail = null;
        this.counter = 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;

        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        counter++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }

        tail = newNode;
        counter++;
    }

    public int popFirst(){
        if(head==null){
            throw new NoSuchElementException("List is Empty.");
        }

        int value = head.data;

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return value;
    }

    public int popBack() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty.");
        }
        Node tmp = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        counter--;
        int value = tmp.data;
        return value;
    }


    public int size() {
        return counter;
    }

    public int size2() {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public boolean exists(int element) {
        if (size() == 0) {
            return false;
        }
        Node temp = head;

        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

}
