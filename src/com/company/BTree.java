package com.company;

public class BTree {
    public BTNode root;
    public int value;

    public BTree (int value) {
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
        if (currentNode == null) {
            System.out.print("");
        }
        else {
            System.out.print(currentNode.value + " ");
            preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
    }

    private void inOrderTraversal(BTNode currentNode) {
        if (currentNode == null) {
            System.out.print("");
        }
        else {
            inOrderTraversal(currentNode.left);
            System.out.print(currentNode.value + " ");
            inOrderTraversal(currentNode.right);
        }
    }

    private void postOrderTraversal(BTNode currentNode) {
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

    private int size(BTNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + size(node.left) + size(node.right);
        }
    }




    public class BTNode {
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
