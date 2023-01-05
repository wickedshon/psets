package com.wickedshon.leetcode.easy;

import java.util.Comparator;

/**
 * author: wickedshon
 * date: 1/3/2023
 * description:
 * status: incomplete
 */
public class BinarySearch {
   public static void main(String[] args) {
      Integer[] nums = new Integer[]{-1, 0, 3, 5, 9, 12};
      System.out.println(bs(nums, 9, true));
   }

   public static <T extends Comparable<T>> int bs(T[] elements, T target,
                                                  boolean isIter) {
      if (isIter) {
         return iter(elements, target);
      }
      return rec(elements, target);
   }

   private static <T extends Comparable<T>> int rec(T[] elements, T target) {
      return 0;
   }


   public static <T extends Comparable<T>> int iter(T[] elements, T target) {
      int start = 0, end = elements.length - 1;
      int mid;
      while (start < end) {
         mid = start + (end - start) / 2;
         T e = elements[mid];
         if (e.equals(target)) {
            return mid;
         } else if (e.compareTo(target) < 0) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }

      return -1;
   }
}
