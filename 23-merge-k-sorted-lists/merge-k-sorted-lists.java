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
    class HoneySingh{
        int val;
        ListNode head;
        HoneySingh(int val,ListNode head){
            this.val=val;
            this.head=head;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<HoneySingh> pq= new PriorityQueue<>((a,b)-> a.val-b.val);
        for(int i=0;i<lists.length;i++){
            ListNode node=lists[i];
           if(node!=null){
             pq.add(new HoneySingh(node.val,node));
           }
        }
        ListNode newHead= new ListNode(-1);
        ListNode temp=newHead;
        while(!pq.isEmpty()){
            HoneySingh poll=pq.poll();
            temp.next=new ListNode(poll.val);
            ListNode node=poll.head;
            if(node.next!=null){
               pq.add(new HoneySingh(node.next.val,node.next));
            }
            temp=temp.next;
        }
        return newHead.next;

    }
}