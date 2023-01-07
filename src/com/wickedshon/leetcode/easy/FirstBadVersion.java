package com.wickedshon.leetcode.easy;

import java.util.Arrays;

/**
 * author: wickedshon
 * date: 1/5/2023
 * description: find bad version of a commit
 * iterative: (Space: Constant; Time: O(logN))
 * recursive (Space: O(logN) for recursive stack; Time: O(logN))
 * status: complete
 */
public class FirstBadVersion {
   public static void main(String[] args) {
      System.out.println(firstBadVersionIter(4));
   }
   public static final int BAD_VERSION = 3;

   public static int firstBadVersionIter(int n) {
      int start = 0, end = n;
      int mid;
      while (start <= end) {
         mid = start + (end - start) / 2;
         if (isBadVersion(mid)) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }

      return start;
   }

   public static int firstBadVersionRec(int n) {
      return helperRec(0, n);
   }

   public static int helperRec(int start, int end){
      if(start > end){
         return start;
      }
      int mid = start + (end - start)/2;
      if(isBadVersion(mid)){
         return helperRec(start, mid - 1);
      }else{
         return helperRec(mid + 1, end);
      }

   }

   private static boolean isBadVersion(int v) {
      return BAD_VERSION == v;
   }
}
