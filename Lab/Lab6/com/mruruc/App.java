package com.mruruc;

public class App {
    public static void main(String[] args) {

        List list=new List();
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(11);
        list.addFirst(2);

        list.printList();
        System.out.println("Size of List: " +list.size2());

        boolean bool= list.exists(11);
        System.out.println(bool);

    }
}
