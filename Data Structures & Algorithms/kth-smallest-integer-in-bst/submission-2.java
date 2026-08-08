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
    public int ans;
    public int count;
    public void solve(TreeNode node, int k){
        if(node==null) return;
        solve(node.left, k);
        count++;
        if(count==k){
            ans= node.val;
            return;
        }
        solve(node.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        ans=0;
        count=0;
        solve(root, k);
        return ans;
    }
}
