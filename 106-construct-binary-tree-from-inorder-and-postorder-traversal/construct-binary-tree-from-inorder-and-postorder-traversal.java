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
    Map<Integer,Integer> map;
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map =new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        index=postorder.length-1;
        int n=postorder.length-1;
        return build(inorder,postorder,0,n);
    }
    public TreeNode build(int inorder[],int postorder[],int start,int end){
        if(start>end) return null;
        TreeNode root= new TreeNode(postorder[index--]);
        int i=map.get(root.val);
        root.right=build(inorder,postorder,i+1,end);
        root.left=build(inorder,postorder,start,i-1);
        return root;
    }
}