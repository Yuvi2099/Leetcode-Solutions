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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>l=new ArrayList<>();
        int idx=1;
        ListNode p=head,c=head.next;
        while(c!=null && c.next!=null){
            if((c.val>p.val && c.val>c.next.val) || (c.val<p.val && c.val<c.next.val)){
                l.add(idx);
            }
            p=c;
            c=c.next;
            idx++;
        }
        if(l.size()<2) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            min=Math.min(min,l.get(i)-l.get(i-1));
        }
        int max=l.get(l.size()-1)-l.get(0);
        return new int[]{min,max};
    }
}