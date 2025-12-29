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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode newNode=null;
        while(temp!=null){
            ListNode kth=find(temp,k);
            if(kth==null){
               if(prev!=null)prev.next=temp;
               break;
            }
            newNode =kth.next;
            kth.next=null;
            ListNode r=reverse(temp);
            if(temp==head) head=r;
            else{
                prev.next=r;
            }
            prev=temp;
            temp=newNode;
        }
        return head;
    }
    public ListNode find(ListNode temp,int k){
        for(int i=1;i<k && temp!=null ;i++){
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}