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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        Map<Integer,Integer> map = new HashMap<>();
        for(ListNode curr = head; curr!=null;curr= curr.next){
            if(map.containsKey(curr.val)){
                map.put(curr.val,map.get(curr.val)+1);
            }
            else map.put(curr.val,1);
        }
        ListNode curr = dummy;
        while(curr!=null){
            while(curr.next!=null && map.containsKey(curr.next.val)&&map.get(curr.next.val)>1){
            curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        
        return dummy.next;

    }
}