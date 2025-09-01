class Solution {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        Map<Integer,Integer> hash = new HashMap<>();
        for(ListNode curr = head; curr != null;curr=curr.next){
            // hash.merge(curr.val,1,Integer::sum);
            if(hash.containsKey(curr.val)){
                hash.put(curr.val,hash.get(curr.val)+1);
            }
            else{
                hash.put(curr.val,1);
            }
        }
        ListNode curr = dummy;
        while(curr!=null){
            while(curr.next!=null && hash.containsKey(curr.next.val)&&hash.get(curr.next.val)>1){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}