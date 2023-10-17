package LinkedList_;

import java.util.*;

public class Linked_List_Cycle {

    public class ListNode {
    int val;
   ListNode next;
 ListNode() { }
   ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
//        ListNode  head = [1,2,3,4,5];
//        Linked_List_Cycle obj = new Linked_List_Cycle();
//        System.out.println(obj.middleNode(head));
    }
}
