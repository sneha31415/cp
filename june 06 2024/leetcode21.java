//https://leetcode.com/problems/merge-two-sorted-lists/

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

 //unlike problem 2 we do not need to create new nodes of result(bcuz here we are not updating the value in nodes of list1 and list2, just reconnecting them), only one node to iniliase is sufficient. Baki nodes of result will be made to point to nodes of list1 and list2
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode result = new ListNode(); //initialise
     ListNode r = result;
     ListNode k1 = list1;
     ListNode k2 = list2;
     int n1 = 0;
     int n2 = 0;
     while(k1 != null && k2 != null){
        n1 = k1.val;
        n2 = k2.val;
        if(n1 < n2){
            result.next = k1;
            k1 = k1.next;
        }
        else{
            result.next = k2;
            k2 = k2.next;
        }
        result = result.next;
     }
     //if one of the List is left, connect the remain part of it to the result list
        if(k1 != null){
            result.next = k1;
        }else{
            result.next = k2;
        }
        return r.next;
     }
    }
