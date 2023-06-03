package com.mruruc;

public class Main {
    public static void main(String[] args) {


        BST_Implementation bst=new BST_Implementation();
        bst.insertIterative(5);
        bst.insertIterative(7);
        bst.insertIterative(8);
        bst.insertIterative(9);

        System.out.println(bst.searchIteratively(5));
        System.out.println(bst.searchIteratively(10));

    }
}
