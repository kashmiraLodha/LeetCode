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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode ans = new ListNode(-1);
        ListNode curr=ans;
        ListNode temp = head;
        while(temp!=null)
        {
            ans.next = temp;
            int value = temp.val;
            temp=temp.next;
            while(temp!=null&&temp.val==value)
                temp=temp.next;
            
            ans = ans.next;
            
        }
        ans.next=null;
        return curr.next;
    }
}