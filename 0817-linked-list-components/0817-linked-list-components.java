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
    public int numComponents(ListNode head, int[] nums) {
        if(head==null) return 0;
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums) h.add(i);
        int count=0;
        while(head!=null){
            if(h.contains(head.val)){
                if(head.next==null || !h.contains(head.next.val)) count++;
            }
            head=head.next;
        }
        return count;
    }
}