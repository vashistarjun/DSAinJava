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
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        path(list, l, root);
        List<String> ans= new ArrayList<>();
        for(List<Integer> li: list){
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<li.size();i++){
                int ch=li.get(i);
                if(i<li.size()-1){
                    sb.append(ch+"->");
                }
                else{
                    sb.append(ch);
                }
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    public void path(List<List<Integer>> list, List<Integer> l, TreeNode root) {
        if (root == null)
            return;
        l.add(root.val);
        if (root.left == null && root.right == null) {
            list.add(new ArrayList<>(l));

        }
        path(list,l,root.left);
        path(list,l,root.right);
        l.remove(l.size()-1);
    }
}