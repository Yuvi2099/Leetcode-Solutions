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
    public ListNode doubleIt(ListNode head) {
        head=reverseList(head);
        ListNode temp=head;
        ListNode prev=null;
        int c=0;
        while(temp!=null){
            int d=(temp.val)*2+c;
            temp.val=d%10;
            c=d/10;
            prev=temp;
            temp=temp.next;
        }
        if(c!=0) prev.next=new ListNode(c);
        return reverseList(head);
    }
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}