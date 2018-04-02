package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a binary search tree
        BTree bstree = new BTree(5);
        bstree.insertBST(3);
        bstree.insertBST(1);
        bstree.insertBST(4);
        bstree.insertBST(10);
        bstree.insertBST(15);
        bstree.insertBST(7);
        bstree.insertBST(11);

        System.out.print("Tree (PreOrder): ");
        bstree.outputPreOrder();

        System.out.print("\nTree (InOrder): ");
        bstree.outputInOrder();

        System.out.print("\nTree (PostOrder): ");
        bstree.outputPostOrder();

        System.out.println("\nTree Size (8): " + bstree.size());

        System.out.println("\nWhat is the maximum value of the tree? (15): " + bstree.maxValue());

        System.out.println("\nWhat is the minimum value of the tree? (1): " + bstree.minValue());

        // Do you understand how level order traversal works?  Why does it use a queue?
        /** Level order traversal starts at the root then it moves to the left node of the root and to the right node.
         * It keeps traversing the tree in this way, until it gets to the end of the tree. A queue is used because it
         * allows for each node to be stored in the order that it was visited, through the push method. The pop method,
         * then allows for the nodes to be printed in the order that they were visited. **/

        System.out.print("\n\nLevel Order Traversal: ");

        bstree.levelOrderTraversal(bstree);

        // Given your btree, what is the sum of all the nodes?
        System.out.println("\nSum of the Nodes (56): " + bstree.sumOfNodes());

        // Is the sum of the left subtree less than the sum of the right subtree?
        System.out.println("\nIs the sum of the left subtree less than the sum of the right subtree (true)? : "
                + bstree.isLeftSubTreeLessThanRightSubTree());

        // How many leaves are in btree?
        System.out.println("\nHow many leaves are in the tree?: " + bstree.howManyLeaves());

        System.out.println("\nIs 10 in both the left subtree and the right subtree?: "
                + bstree.isValueInBothSubTrees(10));

        System.out.println("\nIs the tree a full tree?: " + bstree.isFullTree());


        // Create a binary tree
        BTree bTree = new BTree(31);
        bTree.insertBT(75);
        bTree.insertBT(25);
        bTree.insertBT(105);
        bTree.insertBT(33);
        bTree.insertBT(11);

        System.out.print("Tree (PreOrder): ");
        bTree.outputPreOrder();

        System.out.print("\nTree (InOrder): ");
        bTree.outputInOrder();

        System.out.print("\nTree (PostOrder): ");
        bTree.outputPostOrder();

        System.out.println("\nTree Size (6): " + bTree.size());

        System.out.println("\nWhat is the maximum value of the tree? (105): " + bTree.maxValue());

        System.out.println("\nWhat is the minimum value of the tree? (11): " + bTree.minValue());

        System.out.print("\n\nLevel Order Traversal: ");

        bstree.levelOrderTraversal(bTree);

        System.out.println("\nSum of the Nodes (280): " + bTree.sumOfNodes());

        System.out.println("\nIs the sum of the left subtree less than the sum of the right subtree (true)? : "
                + bTree.isLeftSubTreeLessThanRightSubTree());

        System.out.println("\nHow many leaves are in the tree?: " + bTree.howManyLeaves());

        System.out.println("\nIs 10 in both the left subtree and the right subtree?: "
                + bTree.isValueInBothSubTrees(10));

        System.out.println("\nIs the tree a full tree?: " + bTree.isFullTree());









    }
}
