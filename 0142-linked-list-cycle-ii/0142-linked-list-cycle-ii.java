/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode>h=new HashSet<>();
        ListNode trav=head;
        while(trav!=null){
            if(h.contains(trav)) return trav;
            h.add(trav);
            trav=trav.next;
        }
        return null;
    }
}