/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map= new HashMap<>();
        find(map,root);
        Set<TreeNode> set= new HashSet<>();
        
        List<Integer> list= new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(target);
        set.add(target);
        while(!queue.isEmpty()){
            int size=queue.size();
            if(k==0) break;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null && !set.contains(node.left)){
                    queue.add(node.left);
                    set.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right)){
                    queue.add(node.right);
                    set.add(node.right);
                }
               
                TreeNode parent=map.get(node);
                if(parent!=null && !set.contains(parent)){
                    queue.add(parent);
                    set.add(parent);
                }
            }
            k--;
        }
        if(queue.isEmpty()) return list;
        while(!queue.isEmpty()) list.add(queue.poll().val);
        return list;
    }
    public void find(Map<TreeNode,TreeNode> map,TreeNode root){
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                    map.put(node.left,node);
                }
                if(node.right!=null){
                    queue.add(node.right);
                    map.put(node.right,node);
                }
                
            }
        }
    }
}