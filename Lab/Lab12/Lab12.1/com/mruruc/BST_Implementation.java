package com.mruruc;

public class BST_Implementation extends BST{

    //Inserting Element with Iterative Approach:
    public boolean insertIterative(int data){
        Node node=new Node(data);
        if(root==null){
            root=node;
            counter++;
            return true;
        }
        Node temp=root;
        while(temp!=null){
            //if duplicate not allowed:
            if(node.data==temp.data){
                throw new IllegalArgumentException("Duplicate ELEMENT are not allowed!");
            }
            else if((node.data< temp.data) && (temp.left==null)){
                temp.left=node;
                counter++;
                return true;
            }
            else if(node.data< temp.data){
                temp= temp.left;
            }
            else if((node.data>temp.data)&&(temp.right==null)){
                temp.right=node;
                counter++;
                return true;
            }
            else{
                temp=temp.right;
            }
        }
        return false;
    }

    //Inserting Element with Recursive Approach:

    public void insertRecursive(int data){
        root=insertRecursiveHelper(root,data);
    }

    private Node insertRecursiveHelper(Node root, int data){
        if(root==null){
            counter++;
            return new Node(data);
        }
        if(data< root.data){
            root.left=insertRecursiveHelper(root.left,data);
        }
        if(data> root.data){
            root.right=insertRecursiveHelper(root.right,data);
        }
        return root;
    }

    //Iterative Approach:
    public boolean searchIteratively(int element){
        if(root==null){
            throw new NullPointerException("Tree is Empty!");
        }
        Node temp=root;
        while(temp!=null){
            if(element==temp.data){
                return true;
            }
            //Searching in left side;
            else if(element < temp.data){
                temp=temp.left;
            }
            else  {
                temp=temp.right;
            }
        }
        return false;
    }
    public void deleteIteratively(int element) {
        Node temp = root;
        Node parent = temp;
        while (temp != null) {

            if (element == temp.data) {

                //deleting leaf node;
                if ((temp.left == null) && (temp.right == null)) {
                    if (temp.data < parent.data) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                    return;
                }
                //deleting node with one child:
                else if ((temp.left == null) || (temp.right == null)) {
                    if (temp.data < parent.data) {
                        parent.left = (temp.left != null) ? temp.left : temp.right;
                    } else {
                        parent.right = (temp.left != null) ? temp.left : temp.right;
                    }
                    return;
                }
                //deleting node with 2 children:
                else{
                    int value=findTheSmallestInRightSubTree(temp.right);
                    deleteIteratively(value);
                    temp.data=value;
                    return;
                }
            }

            parent = temp;
            if (element < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        counter--;
    }
    private int findTheSmallestInRightSubTree(Node right) {
        Node parent=null;
        Node temp=right;
        while (temp.left!=null){
            parent=temp;
            temp=temp.left;
        }
        if(parent!=null){
            parent.left=null;
        }
        return temp.data;
    }

    public void  deleteRecursively(int element){
        deleteRecursivelyHelper(root,element);
        counter--;
    }

    private Node deleteRecursivelyHelper(Node root, int element){
        if(root==null){
            return root;
        }
        else if(element< root.data){
            root.left= deleteRecursivelyHelper(root.left,element);
        }
        else if(element > root.data){
            root.right= deleteRecursivelyHelper(root.right,element);
        }
        else {
            //node with only right child OR no child (leaf node);
            if(root.left==null){
                Node temp= root.right;
                root=null;
                return temp;
            }
            //node with only left child:
            else if (root.right == null) {
                Node temp=root.left;
                root=null;
                return temp;
            }
            //node with two children:
            else{
                Node temp=minValue(root.right);
                root.data=temp.data;
                root.right= deleteRecursivelyHelper(root.right,temp.data);
            }
        }
        return root;
    }

    private Node minValue(Node right) {
        Node temp=right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }



    public boolean searchRecursively(int element){
        return searchRecursivelyHelper(root,element);
    }
    private boolean searchRecursivelyHelper(Node root,int element){
        if(root==null){
            return false;
        }
        if(element== root.data){
            return true;
        }
        else if(element< root.data){
            return searchRecursivelyHelper(root.left,element);
        }
        else{
            return searchRecursivelyHelper(root.right,element);
        }
    }

    /* the height of an empty tree is -1 and
     the height of a tree with just one node (a root node with no children) is 0.
     */

    public int height(){
        return heightHelper(root);
    }

    public int heightHelper(Node root){
        if(root==null){
            return -1;
        }
        else {
            int leftHeight= heightHelper(root.left);
            int rightHeight= heightHelper(root.right);

            if(leftHeight>rightHeight){
                return leftHeight +=1;
            }
            else {
                return rightHeight += 1;
            }
        }
    }


    //Print level order(BFS):
    public void printLevelOrder(){
        int height=height();
        for (int i = 0; i <= height+1; i++) {
            printGivenLevel(root,i);
            System.out.println();
        }

    }

    private void printGivenLevel(Node root, int level) {
        if(root==null){
            return;
        }
        else if(level==1){
            System.out.print(root.data+" ");
        }
        else{
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }


    //In-Order Traversal in BST retrieves the nodes values in ASCENDING order;
    public void printInOrder(){
        printInOrderHelper(root);
        System.out.println();
    }

}

