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
        ListNode A=headA;
        ListNode B=headB;
        int count=0;
        while(A!=null && B!=null)
        {
            A=A.next;
            B=B.next;
            count++;
        }
        int temp=count;
        boolean flag=false;
        if(A!=null)
        {   flag=true;
            while(A!=null)
            {
                A=A.next;
                count++;
            }
        }
        boolean flag1=false;
        if(B!=null)
        {
            flag1=false;
            while(B!=null)
            {
                B=B.next;
                count++;
            }
        }
        A=headA;
        B=headB;
        if(flag==true)
        {
            for(int i=0;i<count-temp;i++)
            {
                A=A.next;
            }
        }
        else
        {
            for(int i=0;i<count-temp;i++)
            {
                B=B.next;
            }
        }
        while(A!=null&&B!=null)
        {
            if(A==B)
            {
                return A;
                
            }
            A=A.next;
            B=B.next;
        }
        return null;
        
        
    }
}