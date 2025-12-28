/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode middle=find(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;
         left=sortList(left);
         right=sortList(right);
         return merge(left,right);
     }
     public ListNode find(ListNode head){
        ListNode s1=head;
        ListNode s2=null;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s2=s1;
            s1=s1.next;
            f=f.next.next;
        }
        return s2;
     }
     public ListNode merge(ListNode left,ListNode right){
        ListNode dummy= new ListNode(-1);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val>right.val){
                temp.next=right;
                right=right.next;
            }
            else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return dummy.next;
     }
}