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

        // TODO Do you understand how level order traversal works?  Why does it use a queue?
        /** Level order traversal starts at the root then it moves to the left node of the root and to the right node.
         * It keeps traversing the tree in this way, until it gets to the end of the tree. A queue is used because it
         * allows for each node to be stored in the order that it was visited, through the push method. The pop method,
         * then allows for the nodes to be printed in the order that they were visited. **/

        System.out.print("\n\nLevel Order Traversal: ");

        btree.levelOrderTraversal(btree);

        // TODO Given your btree, what is the sum of all the nodes?
        System.out.println("\nSum of the Nodes (56): " + btree.sumOfNodes());

        // TODO Is the sum of the left subtree less than the sum of the right subtree?
        System.out.println("\nIs the sum of the left subtree less than the sum of the right subtree (true)? : "
                + btree.isLeftSubTreeLessThanRightSubTree());

        // TODO How many leaves are in btree?
        System.out.println("\nHow many leaves are in the tree?: " + btree.howManyLeaves());

        System.out.println("\nIs 10 in both the left subtree and the right subtree?: "
                + btree.isValueInBothSubTrees(10));



    }
}
