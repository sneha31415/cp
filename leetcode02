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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode result = new ListNode();
        ListNode r3 =  new ListNode();
        ListNode head = r3;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry = 0;
        while(p1 != null || p2 != null){
            int x = (p1!=null)? p1.val : 0;
            int y = (p2!=null)? p2.val : 0;
            int smallResult = x + y + carry;
            r3.next = new ListNode(smallResult%10);
            carry = smallResult/10;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            r3 = r3.next;
        }
        if(carry>0){
            r3.next = new ListNode(carry);
        } 
        return head.next;
    }
}
