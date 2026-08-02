/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int h1= height(root.left);
        int h2= height(root.right);
        return Math.max(h1, h2)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int diam1= diameterOfBinaryTree(root.left);
        int diam2= diameterOfBinaryTree(root.right);
        int diam3= height(root.left)+height(root.right)+2;
        return Math.max(Math.max(diam1, diam2), diam3);
    }
}
