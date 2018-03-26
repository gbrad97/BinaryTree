package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
    public BSTNode root;
    public int value;

    public BSTree(int value) {
        this.value = value;
        this.root = new BSTNode(value);
    }

    // calls addBST to start at the root of the tree
    public BSTree insertBST(int value) {
        BSTree tree = this;
        tree.root = addBST(tree.root, value);
        return tree;
    }

    private BSTNode addBST(BSTNode currentNode, int value) {

        if (currentNode == null) {
            return new BSTNode(value);
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



    private void preOrderTraversal(BSTNode currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.left);
            inOrderTraversal(currentNode.right);
        }
    }

    private void inOrderTraversal(BSTNode currentNode) {
        if (currentNode != null){
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.right);
        }
    }

    public void levelOrderTraversal(BSTree root) {
        Queue<BSTNode> queue=new LinkedList<>();
        queue.add(root.root);
        while(!queue.isEmpty())
        {
            BSTNode tempNode=queue.poll();
            System.out.print(tempNode.value + " ");
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

    private void postOrderTraversal(BSTNode currentNode) {
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

    private int size(BSTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    /*
    public int maxValue() {
        return maxValue(root);
    }


    // find the max value of the tree
    private int maxValue(BSTNode node) {
        // check if node is null
        if (node == null) {
            return 0;
        }
        // if node.right == null then the max value is at the root
        else if (node.right == null) {
            return node.value;
        }
        // else keep moving to the right of the root
        return maxValue(node.right);
    }

    public int minValue() {
        return minValue(root);
    }

    private int minValue(BSTNode node) {
        if (node == null) {
            return 0;
        }
        else if (node.left == null) {
            return node.value;
        }
        return minValue(node.left);
    }
    */

    public int maxValue() {
        return findMax(root);
    }

    private int findMax(BSTNode node) {
        if (node == null) {
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

    private int findMin(BSTNode node) {
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

    private int sumOfNodes(BSTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return node.value + sumOfNodes(node.left) + sumOfNodes(node.right);
        }
    }

    private int sumOfLeftSubTree(BSTNode node) {
        return sumOfNodes(node.left);
    }

    private int sumOfRightSubTree(BSTNode node) {
        return sumOfNodes(node.right);

    }

    public boolean isLeftSubTreeLessThanRightSubTree() {
        return isLeftSubTreeLessThanRightSubTree(root);
    }

    private boolean isLeftSubTreeLessThanRightSubTree(BSTNode node) {
        int leftTreeSum = sumOfLeftSubTree(node);
        int rightTreeSum = sumOfRightSubTree(node);
        return leftTreeSum < rightTreeSum;
    }

    public int howManyLeaves() {
        return howManyLeaves(root);
    }

    private int howManyLeaves(BSTNode node) {
        if (node == null) {
            return 0;
        }
        else if (node.left != null && node.right != null) {
            return 1;
        }
        return howManyLeaves(node.left) + howManyLeaves(node.right);
    }

    public boolean isValueInBothSubTrees(int value) {
        return isValueInBothSubTrees(root, value);
    }

    private boolean isValueInBothSubTrees(BSTNode node, int value) {
        return search(node.left, value) && search(node.right, value);
    }

    public boolean search(BSTNode node, int value) {
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

    
    // Is the tree a full tree?
    // Is the tree a binary search tree?
    // Does a path, X next to Y next to Z exist in the tree?
    // Does a path exist between X and Z?
    // Find the lowest common ancestor.


    public class BSTNode {
        int value;
        BSTNode left;
        BSTNode right;

        public BSTNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }

    }








}
