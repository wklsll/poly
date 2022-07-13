package com.wkl.sort;

import com.alibaba.fastjson2.JSON;

/**
 * 冒泡排序
 */
public class BubbleMain {
    public static void main(String[] args) {
        int[] nums = {1, 12, 11, 3, 5, 7, 6, 2, 13, 8};
        sort1(nums);
        sort2(nums);
        sort3(nums);
    }

    public static int[] sort1(int[] nums) {
        System.out.println("===========sort1===========");
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            // System.out.println(JSON.toJSON(nums));
        }
        System.out.println(JSON.toJSON(nums));
        return nums;
    }

    public static int[] sort2(int[] nums) {
        System.out.println("===========sort2===========");
        boolean isSwap = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwap = true;
                }
                System.out.println(JSON.toJSON(nums));

            }
            if (!isSwap) {
                break;
            }
            //   System.out.println(JSON.toJSON(nums));
        }
        System.out.println(JSON.toJSON(nums));
        return nums;
    }

    public static int[] sort3(int[] nums) {
        System.out.println("===========sort3===========");
        boolean isSwap = false;
        int lastIndex = 0;
        int sortBorder = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < sortBorder - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwap = true;
                    lastIndex = j;
                }
                System.out.println(JSON.toJSON(nums));
            }
            sortBorder = lastIndex;
            if (!isSwap) {
                break;
            }
            //   System.out.println(JSON.toJSON(nums));
        }
        System.out.println(JSON.toJSON(nums));
        return nums;
    }
}
