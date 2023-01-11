package com.wickedshon.leetcode.easy;

public class ListNode {
   int val;
   public ListNode next;

   ListNode() {
   }

   ListNode(int val) {
      this.val = val;
   }

   public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}
