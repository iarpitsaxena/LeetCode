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

    public ListNode middleNode(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f!= null && f.next != null){
            s = s.next;
            f =f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head){
        // if(mid == null){
        //     return;
        // }
        ListNode prev = null;
        ListNode next = null;
        ListNode present = head;

        while(present != null){
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;

            // next = (next!= null)? next.next : null;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        // ListNode rereverseHead = headSecond;
        ListNode hf = head;

        while (hs != null && hf != null){
            ListNode temp1 = hf.next;
            hf.next = hs;
            hf = temp1;
            temp1 = hs.next;
            hs.next = hf;
            hs = temp1;
        }
        if(hf != null){
            hf.next = null;
        }

    }
}