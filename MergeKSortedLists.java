class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x,y)->x.val-y.val);
        
        for(ListNode node : lists){
            if(node != null)
                pq.add(node);
        }
        
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(!pq.isEmpty()){
            tail.next = pq.poll();
            tail = tail.next;
            
            if(tail.next != null)
                pq.add(tail.next);
        }
        return head.next;
    }
}