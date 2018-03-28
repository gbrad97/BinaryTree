package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BTree {
    public BTNode root;

    // TODO 03 I'm confused.  Doesn't a BTNode include the value and possibly a left and right BTNode?
    // TODO 04 If so, why does a BTree have a value instance variable?
    public int value;

    // TODO 05 Make your 2 instance variables private and run your code.
    // TODO 06 Remove the value instance variable and run your code.
    // TODO 07 Push this version of your code.

    // TODO 08 Rather than use a BTNode, we could declare a BinaryTree to have these 3 instance variables.
    // TODO 09 By doing this, we're always thinking that the "root" is the "this" object.
    // TODO 10 Create a new class named BinaryTree that has these 3 instance variables and works like your BTree.
    /*
        private int value;
        private BinaryTree left;
        private BinaryTree right;
     */

    public BTree(int value) {
        this.value = value;
        this.root = new BTNode(value);
    }

    // calls addBST to start at the root of the tree
    public BTree insertBST(int value) {
        BTree tree = this;
        tree.root = addBST(tree.root, value);
        return tree;
    }

    private BTNode addBST(BTNode currentNode, int value) {

        if (currentNode == null) {
            return new BTNode(value);
        }
        else {
            if (value <= currentNode.value) {
                currentNode.left = addBST(currentNode.left, value);
            }
            else {
                currentNode.right = addBST(currentNode.right, value);
            }
        }
        return currentNode;
    }




    public void outputPreOrder() {
        preOrderTraversal(root);
    }

    public void outputInOrder() {
        inOrderTraversal(root);
    }

    public void outputPostOrder() {
        postOrderTraversal(root);
    }



    private void preOrderTraversal(BTNode currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.left);
            inOrderTraversal(currentNode.right);
        }
    }

    private void inOrderTraversal(BTNode currentNode) {
        if (currentNode != null){
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.right);
        }
    }

    public void levelOrderTraversal(BTree root) {
        Queue<BTNode> queue=new LinkedList<>();
        queue.add(root.root);
        while(!queue.isEmpty())
        {
            BTNode tempNode=queue.poll();
            System.out.print(tempNode.value + " ");
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

    public BTree insertBT(int value) {
        this.root = addBT(this.root, value);
        return this;
    }

    private BTNode addBT(BTNode currentNode, int value) {
        /*
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(rootNode);
        while(!queue.isEmpty()) {
            // remove current node from queue
            // if the node's left is null, create a new node with the given value; else add it to queue
            // repeat for the node's right
            BTNode tempNode = queue.poll();
            if (tempNode.left == null) {
                tempNode.left = new BTNode(value);
            }
            else {
                queue.add(tempNode.left);
            }
            if (tempNode.right == null) {
                tempNode.right = new BTNode(value);
            }
            else {
                queue.add(tempNode.right);
            }
        }
        */

        if (currentNode == null) {
            return new BTNode(value);
        } else {
            Random rand = new Random();
            int position = rand.nextInt(2);
            // if position == 0, move left
            if (position == 0) {
                currentNode.left = addBT(currentNode.left, value);
            }
            else if (position == 1) {
                currentNode.right = addBT(currentNode.right, value);
            }
        }
        return currentNode;

    }

    private void postOrderTraversal(BTNode currentNode) {
        if (currentNode != null) {
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.print(currentNode.value + " ");
        }
    }

    // call the size method with the tree's root
    public int size() {
        return size(root);
    }

    private int size(BTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    public boolean isLeaf(BTNode node) {
        return node.left == null && node.right == null;

    }


    public int maxValue() {
        return findMax(root);
    }

    private int findMax(BTNode node) {
        if (node == null) {
            // not sure if I'm using this correctly
            return Integer.MIN_VALUE;
        }
        else {
            int max = node.value;
            // find the max of the left subtree
            int leftMax = findMax(node.left);
            // find the max of the right subtree
            int rightMax = findMax(node.right);
            // compare the 3 values
            if (max < leftMax) {
                max = leftMax;
            }
            if (max < rightMax) {
                max = rightMax;
            }
            return max;

        }
    }

    public int minValue() {
        return findMin(root);
    }

    private int findMin(BTNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        else {
            int min = node.value;
            int leftMin = findMin(node.left);
            int rightMin = findMin(node.right);
            if (min > leftMin) {
                min = leftMin;
            }
            if (min > rightMin) {
                min = rightMin;
            }
            return min;
        }
    }

    // find the sum of all the nodes
    public int sumOfNodes() {
        return sumOfNodes(root);
    }

    private int sumOfNodes(BTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return node.value + sumOfNodes(node.left) + sumOfNodes(node.right);
        }
    }


    public boolean isLeftSubTreeLessThanRightSubTree() {
        return isLeftSubTreeLessThanRightSubTree(root);
    }

    private boolean isLeftSubTreeLessThanRightSubTree(BTNode node) {
        int leftTreeSum = size(node.left);
        int rightTreeSum = size(node.right);
        return leftTreeSum < rightTreeSum;
    }

    public int howManyLeaves() {
        return howManyLeaves(root);
    }

    private int howManyLeaves(BTNode node) {
        if (node == null) {
            return 0;
        }
        else if (isLeaf(node)) {
            return 1;
        }
        return howManyLeaves(node.left) + howManyLeaves(node.right);
    }

    public boolean isValueInBothSubTrees(int value) {
        return isValueInBothSubTrees(root, value);
    }

    private boolean isValueInBothSubTrees(BTNode node, int value) {
        return search(node.left, value) && search(node.right, value);
    }

    public boolean search(BTNode node, int value) {
        // check if node.value == root.value
        // check if node.value == root.left.value
        // check if node.value == root.right.value
        if (node != null) {
            if (node.value == value) {
                return true;
            }
            else {
                return search(node.left, value) || search(node.right, value);
            }
        }
        return false;
    }


    // Is the tree a full tree? A full tree is when all of the nodes, except the leaf nodes, have 2 children
    public boolean isFullTree() {
        return isFullTree(root);
    }
    private boolean isFullTree(BTNode node) {
        // if node is null, set boolean to false
        // if node.isLeaf(), then set boolean to true
        // if node has a left and a right child, then set bool to true
        // check the left and right trees of the node
        if (node == null) {
            return false;
        }
        if (isLeaf(node)) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return isFullTree(node.left) && isFullTree(node.right);
        }
        return false;
    }

    // Is the tree a binary search tree?
    // Does a path, X next to Y next to Z exist in the tree?
    // Does a path exist between X and Z?
    // Find the lowest common ancestor.


    // TODO 01 BTNode is called an inner class because it is declared inside the BTree class.
    // TODO 02 BTNode is only known while in BTree so should be private.
    private class BTNode {
        int value;
        BTNode left;
        BTNode right;

        public BTNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }

    }


}
