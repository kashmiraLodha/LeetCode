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
    public int getDecimalValue(ListNode head) {
        
        int count=0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        System.out.println(count);
         temp = head;
        int ans=0;
        while(temp!=null)
        {
        ans+=Math.pow(2,count-1)*temp.val;
        System.out.println(ans);
        temp=temp.next;
            count--;
            
        }
        return ans;
    }
}