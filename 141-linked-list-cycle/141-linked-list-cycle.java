/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head==null){
return false;
}

    ListNode slwPtr=head,fastptr=head;
    while(fastptr.next!=null && fastptr.next.next!=null){
        slwPtr=slwPtr.next;
        fastptr=fastptr.next.next;
        if(slwPtr==fastptr){
            return true;
        }
    }
    return false;  
 
        
    }
}