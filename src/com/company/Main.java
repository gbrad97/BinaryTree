package com.company;

public class Main {

    public static void main(String[] args) {
        BSTree btree = new BSTree(5);
        btree.insertBST(3);
        btree.insertBST(1);
        btree.insertBST(4);
        btree.insertBST(10);
        btree.insertBST(15);
        btree.insertBST(7);
        btree.insertBST(11);

        System.out.print("Tree (PreOrder): ");
        btree.outputPreOrder();

        System.out.print("\nTree (InOrder): ");
        btree.outputInOrder();

        System.out.print("\nTree (PostOrder): ");
        btree.outputPostOrder();

        System.out.println("\nTree Size (8): " + btree.size());

        System.out.println("\nWhat is the maximum value of the tree? (15): " + btree.maxValue());

        System.out.println("\nWhat is the minimum value of the tree? (1): " + btree.minValue());



    }
}
