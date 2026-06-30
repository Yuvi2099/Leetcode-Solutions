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
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0) return null;
        return divideAndMerge(0,k-1,lists);
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else l2.next=mergeTwoLists(l1,l2.next);
        return l2;
    }
    private ListNode divideAndMerge(int low, int high , ListNode[] lists){
        if(low==high) return lists[low];
        int mid=low+(high-low)/2;
        ListNode L1=divideAndMerge(low,mid,lists);
        ListNode L2=divideAndMerge(mid+1,high,lists);
        return mergeTwoLists(L1,L2);
    }
}