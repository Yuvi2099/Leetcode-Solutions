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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        HashMap<Integer,ListNode>m=new HashMap<>();
        int psum=0;
        ListNode curr=dummy;
        while(curr!=null){
            psum+=curr.val;
            m.put(psum,curr);
            curr=curr.next;
        }
        psum=0;
        curr=dummy;
        while(curr!=null){
            psum+=curr.val;
            curr.next=m.get(psum).next;
            curr=curr.next;
        }
        return dummy.next;
    }
}