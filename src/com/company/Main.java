package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a binary search tree
        BTree bsTree = new BTree(5);
        bsTree.insertBST(3);
        bsTree.insertBST(1);
        bsTree.insertBST(4);
        bsTree.insertBST(10);
        bsTree.insertBST(15);
        bsTree.insertBST(7);
        bsTree.insertBST(11);

        System.out.print("Tree (PreOrder): ");
        bsTree.outputPreOrder();

        System.out.print("\nTree (InOrder): ");
        bsTree.outputInOrder();

        System.out.print("\nTree (PostOrder): ");
        bsTree.outputPostOrder();

        System.out.println("\nTree Size (8): " + bsTree.size());

        System.out.println("\nWhat is the maximum value of the tree? (15): " + bsTree.maxValue());

        System.out.println("\nWhat is the minimum value of the tree? (1): " + bsTree.minValue());

        // Do you understand how level order traversal works?  Why does it use a queue?
        /** Level order traversal starts at the root then it moves to the left node of the root and to the right node.
         * It keeps traversing the tree in this way, until it gets to the end of the tree. A queue is used because it
         * allows for each node to be stored in the order that it was visited, through the push method. The pop method,
         * then allows for the nodes to be printed in the order that they were visited. **/

        System.out.print("\n\nLevel Order Traversal: ");

        bsTree.levelOrderTraversal(bsTree);

        // Given your btree, what is the sum of all the nodes?
        System.out.println("\nSum of the Nodes (56): " + bsTree.sumOfNodes());

        // Is the sum of the left subtree less than the sum of the right subtree?
        System.out.println("\nIs the sum of the left subtree less than the sum of the right subtree (true)? : "
                + bsTree.isLeftSubTreeLessThanRightSubTree());

        // How many leaves are in btree?
        System.out.println("\nHow many leaves are in the tree?: " + bsTree.howManyLeaves());

        System.out.println("\nIs 10 in both the left subtree and the right subtree?: "
                + bsTree.isValueInBothSubTrees(10));

        System.out.println("\nIs the tree a full tree?: " + bsTree.isFullTree());

        System.out.println("\nIs the tree a binary search tree? (True): " + bsTree.isBST());

        System.out.println("\nWhat is the height of the tree?: " + bsTree.height());


        // Create a binary tree
        BTree bTree = new BTree(31);
        bTree.insertBT(75);
        bTree.insertBT(25);
        bTree.insertBT(105);
        bTree.insertBT(33);
        bTree.insertBT(11);

        System.out.print("\nTree (PreOrder): ");
        bTree.outputPreOrder();

        System.out.print("\nTree (InOrder): ");
        bTree.outputInOrder();

        System.out.print("\nTree (PostOrder): ");
        bTree.outputPostOrder();

        System.out.println("\nTree Size (6): " + bTree.size());

        System.out.println("\nWhat is the maximum value of the tree? (105): " + bTree.maxValue());

        System.out.println("\nWhat is the minimum value of the tree? (11): " + bTree.minValue());

        System.out.print("\n\nLevel Order Traversal: ");

        bsTree.levelOrderTraversal(bTree);

        System.out.println("\nSum of the Nodes (280): " + bTree.sumOfNodes());

        System.out.println("\nIs the sum of the left subtree less than the sum of the right subtree (true)? : "
                + bTree.isLeftSubTreeLessThanRightSubTree());

        System.out.println("\nHow many leaves are in the tree?: " + bTree.howManyLeaves());

        System.out.println("\nIs 10 in both the left subtree and the right subtree?: "
                + bTree.isValueInBothSubTrees(10));

        System.out.println("\nIs the tree a full tree?: " + bTree.isFullTree());

        System.out.println("\nIs the tree a binary search tree? (False): " + bTree.isBST());

        System.out.println("\nWhat is the height of the tree?: " + bTree.height());









    }
}
