/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp2=headB;
        while(temp!=temp2){
            temp=(temp!=null) ? temp.next : headB;
            temp2=(temp2!=null) ? temp2.next : headA;
        }
        return temp;
    }
}