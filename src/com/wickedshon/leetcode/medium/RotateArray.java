package com.wickedshon.leetcode.medium;

import java.util.Arrays;

/**
 * author: wickedshon
 * date: 1/7/2023
 * description: rotate (shift) generic array elements
 * iterative: (Space: Constant; Time: O(N))
 * recursive: (Space: O(N); Time: O(N))
 * status: complete
 */
public class RotateArray {
   public static void main(String[] args) {
      String[] words = {"word", "text", "book", "apple", "tea"};
      Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
      rotateIter(words, 3, true);
      rotateIter(nums, 3, false);
      System.out.println(Arrays.toString(words));
      System.out.println(Arrays.toString(nums));
   }

   public static <T> void rotateIter(T[] elements, int k, boolean iterative) {
      k %= elements.length;
      if (iterative) {
         helperIter(elements, 0, elements.length - 1);
         helperIter(elements, 0, k - 1);
         helperIter(elements, k, elements.length - 1);
      } else {
         helperRec(elements, 0, elements.length - 1);
         helperRec(elements, 0, k - 1);
         helperRec(elements, k, elements.length - 1);
      }
   }

   public static <T> void helperIter(T[] elements, int start, int end) {
      while (start < end) {
         swap(elements, start, end);
         start++;
         end--;
      }
   }

   public static <T> void helperRec(T[] elements, int start, int end) {
      if (start >= end) {
         return;
      }
      swap(elements, start, end);
      helperRec(elements, ++start, --end);
   }

   public static <T> void swap(T[] elements, int i, int j) {
      T temp = elements[i];
      elements[i] = elements[j];
      elements[j] = temp;
   }
}
