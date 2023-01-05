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
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

      numArrayGenerator(iNums2, 10);
      numArrayGenerator(iNums3, 20);
      numArrayGenerator(iNums4, 30);

      stringArrayGenerator(strings2, 10);
      stringArrayGenerator(strings3, 20);
      stringArrayGenerator(strings4, 30);

      Arrays.sort(iNums2);
      Arrays.sort(iNums3);
      Arrays.sort(iNums4);

      Arrays.sort(strings2);
      Arrays.sort(strings3);
      Arrays.sort(strings4);
   }

   public static void numArrayGenerator(Integer[] elements, int rangeSize) {
      Set<Integer> used = new HashSet<>();
      Random random = new Random();
      for (int i = 0; i < elements.length; i++) {
         int num = random.nextInt(-rangeSize, rangeSize);
         while (!used.add(num)) {
            num += 1;
         }
         elements[i] = num;
      }
   }

   public static void stringArrayGenerator(String[] elements, int rangeSize) {
      Set<Character> used = new HashSet<>();
      Random random = new Random();
      for (int i = 0; i < elements.length; i++) {
         char num = (char) random.nextInt(rangeSize);
         while (!used.add(num)) {
            num += 1;
         }
         elements[i] = WORD + num;
      }
   }


   public static int numGenerator(int limit) {
      Random random = new Random();
      return random.nextInt(0, limit);
   }

   @Test
   void bsIterNum1() {
      int result = BinarySearch.bs(iNums1, 1, true);
      Assertions.assertEquals(result, -1);
   }

   @Test
   void bsIterNum2() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, iNums2[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsIterNum3() {
      int expected = numGenerator(iNums3.length);
      int result = BinarySearch.bs(iNums3, iNums3[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsIterNum4() {
      int expected = numGenerator(iNums4.length);
      int result = BinarySearch.bs(iNums4, iNums4[expected], true);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsIterNum5() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, -100, true);
      Assertions.assertNotEquals(result, expected);
   }

   @Test
   void bsIterNum6() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, -100, true);
      Assertions.assertEquals(result, -1);
   }


   @Test
   void bsIterString1() {
      int result = BinarySearch.bs(strings1, WORD, true);
      Assertions.assertEquals(result, -1);
   }

   @Test
   void bsIterString2() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, strings2[expected], true);
      Assertions.assertEquals(result, expected);
   }
   @Test
   void bsIterString3() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, "wordly", true);
      Assertions.assertEquals(result, -1);
   }
   @Test
   void bsIterString4() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, strings2[expected], true);
      Assertions.assertNotEquals(result, -1);
   }


   @Test
   void bsRecNum1() {
      int result = BinarySearch.bs(iNums1, 1, false);
      Assertions.assertEquals(result, -1);
   }

   @Test
   void bsRecNum2() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, iNums2[expected], false);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsRecNum3() {
      int expected = numGenerator(iNums3.length);
      int result = BinarySearch.bs(iNums3, iNums3[expected], false);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsRecNum4() {
      int expected = numGenerator(iNums4.length);
      int result = BinarySearch.bs(iNums4, iNums4[expected], false);
      Assertions.assertEquals(result, expected);
   }

   @Test
   void bsRecNum5() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, -100, false);
      Assertions.assertNotEquals(result, expected);
   }

   @Test
   void bsRecNum6() {
      int expected = numGenerator(iNums2.length);
      int result = BinarySearch.bs(iNums2, -100, false);
      Assertions.assertEquals(result, -1);
   }


   @Test
   void bsRecString1() {
      int result = BinarySearch.bs(strings1, WORD, false);
      Assertions.assertEquals(result, -1);
   }

   @Test
   void bsRecString2() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, strings2[expected], false);
      Assertions.assertEquals(result, expected);
   }
   @Test
   void bsRecString3() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, "wordly", false);
      Assertions.assertEquals(result, -1);
   }
   @Test
   void bsRecString4() {
      int expected = numGenerator(strings2.length);
      int result = BinarySearch.bs(strings2, strings2[expected], false);
      Assertions.assertNotEquals(result, -1);
   }

}
