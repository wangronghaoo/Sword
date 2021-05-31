package main.java.com.sword.May;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/31
 */
public class FindDisappearedNumbers {
    /**
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。
     * 请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     *
     */
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1}; //-4,-3,-2,-7,8,2,-3,-1
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //将每个元素对应的索引上的元素变为负数
        //仍为正数则为消失的数字
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[Math.abs(nums[i]) - 1] > 0){
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
