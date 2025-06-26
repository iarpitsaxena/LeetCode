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
    public ListNode swapPairs(ListNode head) {
        int length = getLength(head);
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
        for(int i = 0;i < length / 2; ++i){
            ListNode next = curr.next; // next = 2
            curr.next = next.next; // 1.next = 3
            next.next = curr; // 2.next = 1
            prev.next = next; // dummy.next = 2
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }

    private int getLength(ListNode head){
        int length = 0;
        for(ListNode curr = head; curr != null; curr = curr.next){
            ++length;
        }
        return length;
    }
}