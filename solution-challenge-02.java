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
class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode l3 = new ListNode();
        
        if(l1 == null && l2 == null){
            System.exit(100);
        }
        else if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            l3 = l1;
        }
        else{
            l2.next = mergeTwoLists(l1, l2.next);
            l3 = l2;
        }
        
        return l3;
    }
}