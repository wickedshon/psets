package com.wickedshon.leetcode.easy;

/**
 * author: wickedshon
 * date: 1/9/2023
 * description: removing the nth element from the linked list
 * status: complete
 */
public class RemoveNthNode {
   public static ListNode removeNthFromEndPointer(ListNode head, int n) {
      head = new ListNode(0, head);
      ListNode one = head, two = head;
      while (n > 0) {
         two = two.next;
         n--;
      }

      while (two.next != null) {
         two = two.next;
         one = one.next;
      }

      one.next = one.next.next;

      return head.next;
   }

   public static ListNode removeNthFromEndRec(ListNode head, int n) {
      ListNode temp = new ListNode(0, head);
      head = temp;
      remove(temp, n);
      return head.next;
   }

   public static int remove(ListNode head, int n) {
      if (head == null) {
         return 0;
      }

      int nth = remove(head.next, n) + 1;
      if ((nth - 1) == n) {
         head.next = head.next.next;
      }
      return nth;
   }

   public static ListNode removeNthFromEndIter(ListNode head, int n) {
      ListNode temp = new ListNode(0, head);
      head = temp;

      int size = 0;
      while (temp != null) {
         temp = temp.next;
         size++;
      }

      int range = size - n;
      temp = head;
      while (range > 1) {
         temp = temp.next;
         range--;
      }
      temp.next = temp.next.next;

      return head.next;
   }
}
