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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<= 1 || head == null){
            return head;
        }
        int length = getLength(head);

        ListNode current = head;
        ListNode prev = null;
        int count = length / k;

        while(count > 0){
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;

            for(int i = 0;i < k && current!= null;i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }

            }
            if(last != null){
                last.next = prev;
            }
            else{
                head = prev;
            }

            newEnd.next = current;
            prev = newEnd;
            count--;
        }

        return head;
    }
public int getLength(ListNode head){
            ListNode node = head;
            int length = 0;
            while (node != null){
                node = node.next;
                length++;
            }
            return length;
}
}
