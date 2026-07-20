class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode prev=head.next;
        ListNode curr=prev;
        while(curr!=null){
            int sum=0;
            while(curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            }
            prev.val=sum;
            curr=curr.next;
            prev.next=curr;
            prev=curr;
        }
        return head.next;
    }
}