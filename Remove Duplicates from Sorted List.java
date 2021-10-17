// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

// Example 1:


// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:


// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 

// Constraints:

// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

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
        ListNode pre=head,cur=head;
        if(head==null)
            return null;
        int preValue=pre.val;
        
        while(cur.next!=null){
            boolean flag=false;
            while(preValue==cur.val){
                
                if(cur.next==null)  {
                    flag=true;
                        break;
                }
                cur=cur.next;
            }
            if(flag){
                pre.next=null;
            }
            else{
            pre.next=cur;
            }
            pre=cur;
            preValue=cur.val;
        }
        return head;
    }
}
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
// Memory Usage: 38.6 MB, less than 52.60% of Java online submissions for Remove Duplicates from Sorted List.
