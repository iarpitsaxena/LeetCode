/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = getDiff(headA, headB);

        if(diff < 0){
            while(diff++ != 0){
                headB = headB.next;
            }
        }
        else{
                while(diff-- != 0) headA = headA.next;
        }
        

        while(headA != null && headB != null){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
        
    }
    private int getDiff(ListNode headA, ListNode headB){
        int len1 = 0, len2 = 0;
        ListNode tempA = headA, tempB = headB;
        while(tempA != null){
            len1++;
            tempA = tempA.next;
        }
        while(tempB != null){
            len2++;
            tempB = tempB.next;
        }
        return len1 - len2;
    }

}