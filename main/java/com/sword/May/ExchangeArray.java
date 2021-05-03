package main.java.com.sword.May;

import java.util.Arrays;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/3
 */
public class ExchangeArray {
    /**
     * 给定一个数组,将奇数放在数组的前面,偶数放在数组的后面
     * [1,2,3,4] out [1,3,2,4]
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 7, 8};
        System.out.println(Arrays.toString(exchange(nums)));
    }

    private static int[] exchange(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums;
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 1) {
                res[left] = num;
                left++;
            } else {
                res[right] = num;
                right--;
            }
        }
        return res;
    }
}
