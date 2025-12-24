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

    public boolean findTarget(TreeNode root, int k) {
        if(root==null ) return false;
       List<Integer> list=new ArrayList<>();
       inorder(list,root);
       int a=0;
       int b=list.size()-1;
       while(a<b){
        if(list.get(a)+list.get(b)==k) return true;
        else if(list.get(a)+list.get(b)>k) b--;
        else{
            a++;
        }
       }
       return false;
    }
    public void inorder(List<Integer> list,TreeNode root){
        if(root==null) return ;
        
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }

}