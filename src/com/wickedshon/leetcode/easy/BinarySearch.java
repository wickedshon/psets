package com.wickedshon.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * author: wickedshon
 * date: 1/3/2023
 * description:
 * status: incomplete
 */
public class BinarySearch {

   public static <T extends Comparable<T>> int bs(T[] elements, T target,
                                                  boolean isIter) {
      System.out.println("Given: " + Arrays.toString(elements));
      System.out.println("Finding: " + target);
      if (isIter) {
         return iter(elements, target);
      }
      return rec(elements, target);
   }

   private static <T extends Comparable<T>> int rec(T[] elements, T target) {
      return recHelper(elements, 0, elements.length - 1, target);
   }

   private static <T extends Comparable<T>> int recHelper(T[] elements,
                                                          int start, int end,
                                                          T target) {
      if (start > end) {
         return -1;
      }
      int mid = start + (end - start) / 2;
      if (elements[mid].equals(target)) {
         return mid;
      } else if (elements[mid].compareTo(target) < 0) {
         return recHelper(elements, mid + 1, end, target);
      } else {
         return recHelper(elements, start, mid - 1, target);
      }

   }


   public static <T extends Comparable<T>> int iter(T[] elements, T target) {
      int start = 0, end = elements.length - 1;
      int mid;
      while (start <= end) {
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
