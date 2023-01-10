package com.wickedshon.leetcode.easy;

/**
 * author: wickedshon
 * date: 1/9/2023
 * description:
 * status: complete
 */
public class StringWords {
   public static void main(String[] args) {
      System.out.println(reverseWords("Hello word"));
   }
   public static String reverseWords(String s) {
      String[] words = s.split(" ");
      for(int i = 0; i < words.length; i++){
         words[i] = reverseWord(words[i]);
      }
      return String.join(" ", words);
   }

   public static String reverseWord(String s){
      String left = "";
      String right = "";

      int start = 0, end = s.length() - 1;
      while(start < end){
         left += s.charAt(end--);
         right = s.charAt(start++) + right;
      }

      if(s.length() % 2 == 0){
         return left + right;
      }

      return left + s.charAt(s.length() / 2) + right;
   }
}
