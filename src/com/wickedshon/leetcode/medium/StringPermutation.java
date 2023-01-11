package com.wickedshon.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * author: wickedshon
 * date: 1/10/2023
 * description: find if s1 is permutation of s2 string
 * status: incomplete, needs review
 */
public class StringPermutation {
   public static boolean checkInclusion(String s1, String s2) {
      if (s1.length() > s2.length()) {
         return false;
      }
      int i = 0;
      while (i < s2.length()) {
         int j = i;
         Map<Character, Integer> counts = new HashMap<>();
         for (int k = 0; k < s1.length(); k++) {
            char c = s1.charAt(k);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
         }
         if (s1.length() > s2.length() - j) {
            return false;
         }
         while (j < s2.length()) {
            char c = s2.charAt(j);
            if (!counts.containsKey(c)) {
               break;
            }
            counts.put(c, counts.get(c) - 1);
            if (counts.get(c) == 0) {
               counts.remove(c);
            }
            if (counts.size() == 0) {
               return true;
            }
            j++;
         }
         i++;
      }

      return false;
   }
}
