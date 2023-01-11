package com.wickedshon.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * author: wickedshon
 * date: 1/10/2023
 * description: find the size of the longest non-repeating substring
 * status: incomplete, needs review
 */
public class LongestSubstring {
   public static void main(String[] args) {
      System.out.println(lengthOfLongestSubstring("abcabcabcdefgads"));
   }

   public static int lengthOfLongestSubstring(String s) {
      int start = 0;
      int max = 0;
      while (start < s.length()) {
         Set<Character> words = new HashSet<>();
         int temp = start;
         while (temp < s.length()) {
            if (!words.add(s.charAt(temp))) {
               break;
            }
            temp++;
         }
         max = Integer.max(max, temp - start);
         start++;
      }

      return max;
   }
}
