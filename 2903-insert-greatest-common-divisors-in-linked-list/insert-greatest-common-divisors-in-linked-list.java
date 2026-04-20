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
      List<Integer> list= new ArrayList<>();
      ListNode temp=head;
      while(temp.next!=null){
        int a=temp.val;
        int b=temp.next.val;
        list.add(gcd(a,b));
        temp=temp.next;
      }
       temp=head;
      int i=0;
      while(i<list.size() && temp!=null){
        ListNode next=temp.next;
        ListNode newNode= new ListNode(list.get(i++));
        temp.next=newNode;
        newNode.next=next;
        temp=next;
      }
      return head;
    }
}