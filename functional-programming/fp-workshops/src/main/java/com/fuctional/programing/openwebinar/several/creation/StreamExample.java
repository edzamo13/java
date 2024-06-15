package com.fuctional.programing.openwebinar.several.creation;

import java.util.Arrays;

public class StreamExample {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};
    usingSumAndCount(nums);
  }

  private static void usingSumAndCount(int[] nums) {
    System.out.println(Arrays.stream(nums)
        .sum());

    System.out.println(Arrays.stream(nums)
        .count());

  }
}
