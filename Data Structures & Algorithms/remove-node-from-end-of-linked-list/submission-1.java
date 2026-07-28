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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int remove= count- n;
        if(remove==0){
            return head.next;
        }
        curr= head;
        for(int i=0;i<count-1;i++){
            if(i+1==remove){
                curr.next= curr.next.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}
