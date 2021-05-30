package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/30
 */
public class MissingNumber {
    /**
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     */

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        //数学
        //求出[0,num.length]的和 - 数组中和
        int total = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        return total - sum;
    }
}
