package com.company;

public class Main {

    public static void main(String[] args) {
        BTree btree = new BTree(5);
        btree.insertBST(3);
        btree.insertBST(1);
        btree.insertBST(4);
        btree.insertBST(10);
        btree.insertBST(15);
        btree.insertBST(7);
        btree.insertBST(11);

        System.out.println("Tree (PreOrder) (5 3 1 4 10 7 15 11): ");
        btree.outputPreOrder();

        System.out.print("\nTree (InOrder) (1 3 4 5 7 10 11 15): ");
        btree.outputInOrder();

        System.out.print("\nTree (PostOrder) (1 4 3 7 11 15 10 5): ");
        btree.outputPostOrder();

        // TODO Do you understand how level order traversal works?  Why does it use a queue?
        System.out.print("\n\nLevel Order Traversal: ");
        btree.levelOrderTraversal(btree);

        // TODO Given your btree, what is the sum of all the nodes?
        // TODO Is the sum of the left subtree less than the sum of the right subtree?
        // TODO How many leaves are in btree?


    }
}
