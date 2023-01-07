package com.wickedshon.leetcode.easy;

import java.util.Arrays;

/**
 * author: wickedshon
 * date: 1/7/2023
 * description: sort the sqaured sorted array
 * iterative: (Space: O(N); Time: O(N))
 * recursive: (Space: O(N) + recursive stack size; Time: O(N))
 * status: complete
 */
public class SquareSortedArray {
   public static void main(String[] args) {
      System.out.println(Arrays.toString(sortedSquaresIter(
              new int[]{-10000, -9999, -7, -5, 0, 0, 10000})));
      System.out.println(Arrays.toString(
              sortedSquaredRec(new int[]{-10000, -9999, -7, -5, 0, 0, 10000})));
   }

   public static int[] sortedSquaresIter(int[] nums) {
      int start = 0, end = nums.length - 1;
      int left, right;
      int[] powered = new int[nums.length];
      for (int i = nums.length - 1; i >= 0; i--) {
         left = pow(nums[start]);
         right = pow(nums[end]);
         if (left > right) {
            powered[i] = left;
            start++;
         } else {
            powered[i] = right;
            end--;
         }
      }

      return powered;
   }

   public static int[] sortedSquaredRec(int[] nums) {
      int start = 0, end = nums.length - 1;
      int[] powered = new int[nums.length];
      helperRec(nums, powered, start, end, nums.length - 1);

      return powered;
   }

   public static void helperRec(int[] nums, int[] powered, int start, int end,
                                int index) {
      if (index < 0) {
         return;
      }
      int left = pow(nums[start]);
      int right = pow(nums[end]);
      if (left > right) {
         powered[index] = left;
         helperRec(nums, powered, ++start, end, --index);
      } else {
         powered[index] = right;
         helperRec(nums, powered, start, --end, --index);
      }

   }

   public static int pow(int i) {
      return (int) Math.pow(i, 2);
   }
}
