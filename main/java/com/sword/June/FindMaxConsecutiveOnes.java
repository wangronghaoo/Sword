package main.java.com.sword.June;

/**
 * @Author: WangRongHao
 * @Date: 2021/6/1
 */
public class FindMaxConsecutiveOnes {
    /**
     * 给定一个二进制数组， 计算其中最大连续 1 的个数。
     */
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,0,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        //寻找到连续1的个数,将最大的赋值给max
        int count = 0,max = 0;
        for(int num : nums){
            if(num == 1)count++;
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return max;
    }
}
