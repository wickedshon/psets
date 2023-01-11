package com.wickedshon.leetcode.easy;

/**
 * author: wickedshon
 * date: 1/9/2023
 * description: return the middle element in the linked list
 * status: complete
 */
public class MiddleNode {
   public static ListNode middleNodeIter(ListNode head) {
      if (head.next == null) {
         return head;
      }

      ListNode one = head;
      ListNode two = head;
      while (two.next != null && two.next.next != null) {
         one = one.next;
         two = two.next.next;
      }
      if (two.next != null) {
         return one.next;
      }
      return one;
   }

   public static ListNode middleNodeIter2(ListNode head) {
      if (head.next == null) {
         return head;
      }
      ListNode temp = head.next;
      int i = 0;

      while (temp.next != null) {
         temp = temp.next;
         i++;
      }
      i /= 2;
      while (i >= 0) {
         i--;
         head = head.next;
      }

      return head;


   }

   public static ListNode middleNodeRec(ListNode head) {
      if (head.next == null) {
         return head;
      }
      return middleNode(head, head);
   }

   public static ListNode middleNode(ListNode one, ListNode two) {
      if (two.next == null) {
         return one;
      }
      if (two.next.next == null) {
         return one.next;
      }

      return middleNode(one.next, two.next.next);
   }
}

