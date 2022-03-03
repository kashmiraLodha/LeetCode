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
import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create PQ with comparator
        PriorityQueue<ListNode> pq = new PriorityQueue(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                if (l1.val > l2.val) {
                    return 1;
                }
                else if (l1.val == l2.val) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
        });
        
        // Iterate through each item on list and add them to the PQ
        for(int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];
            
            while (curr != null) {
                ListNode node = new ListNode(curr.val);
                pq.add(node);
                curr = curr.next;
            }
        }
        
        // Create results linked list
        ListNode curr = new ListNode(-1);
        ListNode head = curr;
        
        // Poll items from PQ onto result linkedlist
        while (!pq.isEmpty()) {
            ListNode item = pq.poll();
            curr.next = item;
            curr = curr.next;
        }
        
        return head.next;
    }
}