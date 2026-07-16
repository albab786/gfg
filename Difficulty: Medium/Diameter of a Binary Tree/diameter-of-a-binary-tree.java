/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    public int diameter(Node root) {
      int[] maxDiameter = new int[1];
        calculateHeight(root, maxDiameter);
        return maxDiameter[0];
    }
    private int calculateHeight(Node root, int[] maxDiameter) {
        if (root == null) return 0;
        
        // Recursively find the height of left and right subtrees
        int leftHeight = calculateHeight(root.left, maxDiameter);
        int rightHeight = calculateHeight(root.right, maxDiameter);
        
        // The diameter at the current node is leftHeight + rightHeight
        // Update our global maximum if this path is longer
        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);
        
        // Return the height of the current node to its parent
        return Math.max(leftHeight, rightHeight) + 1;
    }
}