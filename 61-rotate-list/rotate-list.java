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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;    //temp=tail 
        k=k%length;
        temp=head;
        for(int i=0;i<length-k-1;i++){
            temp=temp.next;
        }
        ListNode newhead=temp.next;
        temp.next=null;
        return newhead;

    }
}