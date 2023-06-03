package com.mruruc;

public class BST {
    Node root;
    int counter;

    public int getSize() {
        return this.counter;
    }

    boolean isEmpty() {
        return root == null;
    }

    int peek() {
        if (root == null) {
            throw new NullPointerException("Tree is Empty!");
        }
        return root.data;
    }

    void printInOrderHelper(Node root) {
        if (root == null) {
            return;
        }
        printInOrderHelper(root.left);
        System.out.print(root.data + " ");
        printInOrderHelper(root.right);
    }

    private static int Space = 5;

    private void printGraphicallyHelper(Node root, int space) {
        if (root == null) {
            return;
        }
        space = space + Space;
        printGraphicallyHelper(root.right, space);
        System.out.println();
        for (int i = Space; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(root.data);
        printGraphicallyHelper(root.left, space);
    }

    public void printGraphically() {
        printGraphicallyHelper(root, 5);
        System.out.println();
    }


    void printPreOrder() {
        printPreOrderHelper(root);
        System.out.println();
    }

    private void printPreOrderHelper(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        printPreOrderHelper(root.left);
        printPreOrderHelper(root.right);
    }


    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
