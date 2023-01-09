package com.wickedshon.leetcode.easy;

import java.util.Arrays;

/**
 * author: wickedshon
 * date: 1/8/2023
 * description: Reversing char array
 * status: incomplete
 */
public class ReverseString {
   public static void main(String[] args) {
      char[] s = {'a', 'b', 'c'};
      reverseStringIter(s);
      System.out.println(Arrays.toString(s));
   }

   public static void reverseStringIter(char[] s) {
      int start = 0, end = s.length - 1;
      while (start < end) {
         swap(s, start, end);
         start++;
         end--;
      }
   }

   public void reverseStringRec(char[] s) {
      helperRec(s, 0, s.length - 1);
   }

   public void helperRec(char[] s, int start, int end) {
      if (end <= start) {
         return;
      }
      swap(s, 0, s.length - 1);
      helperRec(s, ++start, --end);
   }

   public static void swap(char[] s, int i, int j) {
      char temp = s[j];
      s[j] = s[i];
      s[i] = temp;
   }
}
