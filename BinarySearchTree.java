package org.Leetcode;

// This class represents a Binary Search Tree
public class BinarySearchTree {
    // This nested class represents a Node of the BST
    static class Node {
        int data; // Data stored in a node
        Node left, right; // References to the left and right children of a node

        Node(int data) { // Constructor to create a new node with the given data
            this.data = data;
        }
    }

    // This method recursively inserts a new node with the given value into the BST
    public static Node insert(Node root, int val) {
        if (root == null) { // If the root is null, create a new node and make it the root
            root = new Node(val);
            return root;
        }
        if (root.data > val) { // If the value to be inserted is less than the root, insert it into left subtree
            root.left = insert(root.left, val);
        } else { // If the value to be inserted is greater than or equal to the root, insert it into right subtree
            root.right = insert(root.right, val);
        }
        return root; // Return the updated root
    }

    // This method recursively performs an inorder traversal of the BST and prints the node values in sorted order
    public static void inorder(Node root) {
        if (root == null) { // If the root is null, there is no node to visit
            return;
        }
        inorder(root.left); // Visit the left subtree
        System.out.print(root.data + " "); // Visit the root
        inorder(root.right); // Visit the right subtree
    }

    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data > key){
            return search(root.left,key);
        }
        if(root.data == key){
            return true;
        }
        else {
            return search(root.right,key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left = delete(root.left,val);
        }
        else if(root.data < val){
            root.right= delete(root.right,val);
        }
        else { //1st case
            if(root.left==null && root.right==null){
                return null;
            } //second case
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;

            }

            Node IS= inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left!= null){
            root=root.left;

        }
        return root;

    }

    public static void main(String[] args) {
        int values[] = { 2, 6, 8, 4, 5 }; // Array of values to be inserted into the BST
        Node root = null; // Initialize the root to null
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]); // Insert each value into the BST
        }
        inorder(root); // Print the BST in sorted order
        System.out.println(); // Move to the next line

        delete(root,4);
        inorder(root);

        if(search(root,6)){
            System.out.println("found");

        }else{
            System.out.println("not found");
        }
    }
}