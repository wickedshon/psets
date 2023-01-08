package com.wickedshon.leetcode.easy;

/**
 * author: wickedshon
 * date: 1/8/2023
 * description: move the zeros to the right: (Space: Constant; Time: O(N))
 * status: complete
 */
public class MoveZeros {
   public static void moveZeroesNoSwaps(int[] nums) {
      int i = 0, j = 0;
      while (j < nums.length) {
         if (nums[j] == 0) {
            j++;
            continue;
         }
         nums[i] = nums[j];
         i++;
         j++;
      }

      while (i < nums.length) {
         nums[i] = 0;
         i++;
      }
   }

   public static void moveZeroesSwaps(int[] nums) {
      int i = 0, j = 0;
      while (j < nums.length) {
         if (nums[j] != 0) {
            swap(nums, i, j);
            i++;
         }
         j++;
      }
   }

   public static void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }
}
