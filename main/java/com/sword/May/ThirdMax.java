package main.java.com.sword.May;

import java.util.Arrays;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/30
 */
public class ThirdMax {
    /**
     * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
     */
    public static void main(String[] args) {
        int[] num = {3,2,1,4};
        System.out.println(thirdMax(num));
    }
    private static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        //动态规划,对原数组进行排,最后返回dp[2]
        int[] dp = new int[nums.length];
        int idx = 0;
        dp[idx++] = nums[nums.length - 1];
        for(int j = nums.length - 2; j >= 0;j--){
            if(nums[j] < dp[idx - 1]){
                dp[idx++] = nums[j];
            }
            if(idx == 3) return dp[2];
        }
        return dp[0];
    }
}
