/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {

    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next!= null){
            s= s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
        }
        if(next != null){
            next = next.next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);
        return head == null || headSecond == null;
        
    }
}
*/

class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;

        while (present != null) {
            ListNode next = present.next; // Store next node
            present.next = prev;          // Reverse link
            prev = present;               // Move prev forward
            present = next;               // Move present forward
        }
        return prev; // New head of reversed list
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // Edge case

        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid); // Reverse second half
        ListNode firstHalf = head;

        while (headSecond != null) { // Only iterate through the second half
            if (firstHalf.val != headSecond.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            headSecond = headSecond.next;
        }

        return true;
    }
}
