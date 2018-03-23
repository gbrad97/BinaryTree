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
        if (currentNode == null) {
            System.out.print("");
        }
        else {
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.left);
            inOrderTraversal(currentNode.right);
        }
    }

    private void inOrderTraversal(BSTNode currentNode) {
        if (currentNode == null) {
            System.out.print("");
        }
        else {
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
        if (currentNode == null) {
            System.out.print("");
        }
        else {
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
        if (node == null) {
            return 0;
        }
        else {
            return node.value + sumOfLeftSubTree(node.left);
        }
    }

    private int sumOfRightSubTree(BSTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return node.value + sumOfRightSubTree(node.right);
        }
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
