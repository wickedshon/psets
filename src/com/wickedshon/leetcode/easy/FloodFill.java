package com.wickedshon.leetcode.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * author: wickedshon
 * date: 1/10/2023
 * description: fill the same neighbor with the target color in the given matrix
 * status: incomplete, needs review
 */
public class FloodFill {
   public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
      Queue<Pixel> pixels = new LinkedList<>();
      Set<String> visited = new HashSet<>();
      pixels.add(new Pixel(sr, sc));
      int oldColor = image[sr][sc];

      while (!pixels.isEmpty()) {
         Pixel pixel = pixels.remove();
         int r = pixel.r;
         int c = pixel.c;
         String point = r + "," + c;
         if (visited.contains(point)) continue;
         image[r][c] = color;
         visited.add(point);
         evaluate(pixels, image, r - 1, c, oldColor);
         evaluate(pixels, image, r + 1, c, oldColor);
         evaluate(pixels, image, r, c - 1, oldColor);
         evaluate(pixels, image, r, c + 1, oldColor);
      }

      return image;
   }

   public static void evaluate(Queue<Pixel> pixels, int[][] image, int r, int c,
                               int color) {
      if (isValid(image, r, c, color)) pixels.add(new Pixel(r, c));
   }

   public static boolean isValid(int[][] image, int r, int c, int color) {
      return (r >= 0 && r < image.length) &&
              (c >= 0 && c < image[r].length)
              && image[r][c] == color;
   }
}

class Pixel {
   int r;
   int c;

   Pixel(int r, int c) {
      this.r = r;
      this.c = c;
   }
}

