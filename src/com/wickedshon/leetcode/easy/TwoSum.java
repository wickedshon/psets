package com.wickedshon.leetcode.easy;

import java.util.Arrays;

/**
 * author: wickedshon
 * date: 1/8/2023
 * description:
 * status: incomplete
 */
public class TwoSum {
   public static void main(String[] args) {
      System.out.println(
              Arrays.toString(twoSumIter(new int[]{1, 3, 5, 7}, 10)));
      System.out.println(Arrays.toString(twoSumRec(new int[]{1, 3, 5, 7}, 10)));
   }

   public static int[] twoSumIter(int[] numbers, int target) {
      int start = 0, end = numbers.length - 1;
      int[] nums = new int[2];
      while (start < end) {
         int sum = numbers[start] + numbers[end];
         if (sum == target) {
            nums[0] = start + 1;
            nums[1] = end + 1;
            break;
         }
         if (sum > target) {
            end--;
         } else {
            start++;
         }
      }

      return nums;
   }

   public static int[] twoSumRec(int[] numbers, int target) {
      return helperRec(numbers, 0, numbers.length - 1, target);
   }

   public static int[] helperRec(int[] nums, int start, int end, int target) {
      int sum = nums[start] + nums[end];
      if (sum == target) {
         return new int[]{start + 1, end + 1};
      }

      if (sum > target) {
         return helperRec(nums, start, --end, target);
      } else {
         return helperRec(nums, ++start, end, target);
      }
   }
}
