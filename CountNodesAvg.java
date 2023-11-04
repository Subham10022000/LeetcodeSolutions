package org.Leetcode;

public class CountNodesAvg {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = null; // Represented as null in the input
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        int result = solution.averageOfSubtree(root);
        System.out.println("Number of nodes with values equal to the average of child nodes: " + result);
    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    private int res = 0;

    public int averageOfSubtree(TreeNode root) {
        postorder(root);
        return res;
    }

    private int[] postorder(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0}; // sum, number of nodes
        }
        int[] left = postorder(node.left);
        System.out.println(left[0]);
        System.out.println("------------------------------------");
        int[] right = postorder(node.right);

        System.out.println(right[0]);
        int totalSum = left[0] + right[0] + node.val;
        int totalCount = 1 + left[1] + right[1];
        res += (node.val == totalSum / totalCount ? 1 : 0);
        return new int[]{totalSum, totalCount};
    }
}
