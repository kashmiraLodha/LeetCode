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
     ListNode prev =new ListNode(-1,null);
        ListNode dummy=prev;
        ListNode curr=head;
        while(curr!=null)
     {
         int ele = curr.val;
        ListNode temp =curr;
         curr=curr.next;
         boolean flag=true;
         while(curr!=null&& curr.val==ele)
         {
             curr=curr.next;
             flag=false;
         }
         if(flag==true)
         {
             prev.next = temp;
             prev=temp;
             
         }
            
     }
        prev.next=null;
        return dummy.next;
        
        
    }
}