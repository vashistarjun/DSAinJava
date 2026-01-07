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
    int d;
    
    public int diameterOfBinaryTree(TreeNode root) {
        d=0;
         int a=h(root);
         return d-1;

    }
    public int h(TreeNode root){
        if(root==null) return 0;
        int left=h(root.left);
        int right=h(root.right);
        int dia=left+right+1;
        d=Math.max(d,dia);
        return Math.max(left,right)+1;
    }
}