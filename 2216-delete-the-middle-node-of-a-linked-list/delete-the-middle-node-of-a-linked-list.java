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
    public ListNode deleteMiddle(ListNode head) {
         // You only need to complete the method.
        if(head==null || head.next==null) return null;
        ListNode s1=head;
        ListNode s2=null;
        ListNode f=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s2=s1;
            s1=s1.next;
        }
        s2.next=s2.next.next;
        return head;
    }
}