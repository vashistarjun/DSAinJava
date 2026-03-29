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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=head;
        while(temp.next!=slow){
            temp=temp.next;
        }
        temp.next=null;
        //first half --> head
        // second half--> slow;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=slow;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //first half-->head;
        //second half--> prev
        ListNode l1 = head;
        ListNode l2 = prev;

            while(l1 != null && l2 != null){
                    ListNode n1 = l1.next;
                    ListNode n2 = l2.next;

                        l1.next = l2;
                        if(n1 == null) break;   // edge case

                    l2.next = n1;

                    l1 = n1;
                    l2 = n2;
}
    }
}