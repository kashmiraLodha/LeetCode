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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp =head;
        
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if(size==1)
            return head=null;
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        if(size%2==0)
            slow=slow.next;
        ListNode before = null;
        temp=head;
        for(int i=0;i<size/2-1;i++)
        {
            temp=temp.next;
        }
        temp.next =slow.next;
        return head;
        
    }
}