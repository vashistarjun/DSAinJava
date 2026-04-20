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
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         if(head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            int x=temp.val;
            int y=temp.next.val;
            int z=gcd(x,y);
            ListNode newNode= new ListNode(z);
            ListNode next=temp.next;
            newNode.next=temp.next;
            temp.next=newNode;
            temp=next;
        }
        return head;
    }
}