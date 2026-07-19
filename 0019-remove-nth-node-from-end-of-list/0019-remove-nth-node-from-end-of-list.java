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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)) return null;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n) return head.next;
        if(n==1){
            head=reverse(head);
            return reverse(head.next);
        }
        int p=len-n;
        ListNode curr=head;
        while(curr!=null){
            if(p==0){
                curr.val=curr.next.val;
                curr.next=curr.next.next;
                break;
            }
            p--;
            curr=curr.next;
        }
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}