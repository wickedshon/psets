package com.wickedshon.leetcode.test;

import com.wickedshon.leetcode.easy.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Random;

/**
 * author: wickedshon
 * date: 1/3/2023
 * description:
 * status: incomplete
 */
public class BinarySearchTest {

   private static final String WORD = "word";
   private static Integer[] iNums1, iNums2, iNums3, iNums4;
   private static Long[] lNums1, lNums2, lNums3, lNums4;
   private static String[] strings1, strings2, strings3, strings4;

   @BeforeAll
   public static void init() {
      iNums1 = new Integer[0];
      iNums2 = new Integer[10];
      iNums3 = new Integer[50];
      iNums4 = new Integer[100];

      strings1 = new String[0];
      strings2 = new String[10];
      strings3 = new String[50];
      strings4 = new String[100];

      numGenerator(iNums2, 10);
      numGenerator(iNums3, 20);
      numGenerator(iNums4, 30);

      stringGenerator(strings2, 10);
      stringGenerator(strings3, 20);
      stringGenerator(strings4, 30);

      Arrays.sort(iNums2);
      Arrays.sort(iNums3);
      Arrays.sort(iNums4);

      Arrays.sort(strings2);
      Arrays.sort(strings3);
      Arrays.sort(strings4);
   }

   public static void numGenerator(Integer[] elements, int rangeSize) {
      Random random = new Random();
      for (int i = 0; i < elements.length; i++) {
         int num = random.nextInt(-rangeSize, rangeSize);
         elements[i] = num;
      }
   }

   public static void stringGenerator(String[] elements, int rangeSize) {
      Random random = new Random();
      for (int i = 0; i < elements.length; i++) {
         int num = random.nextInt(-rangeSize, rangeSize);
         elements[i] = WORD + num;
      }
   }

   public static int numGenerator(int limit) {
      Random random = new Random();
      return random.nextInt(limit - 1);
   }

   @Test
   void bsNum2() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, iNums2[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsNum3() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, iNums2[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsNum4() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, iNums2[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void iter() {
   }
}
