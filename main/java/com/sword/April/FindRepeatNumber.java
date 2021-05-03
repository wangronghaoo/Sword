package main.java.com.sword.April;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/29
 */
public class FindRepeatNumber {
    /**
     * 给定一个数组,寻找出第一个重复的数字
     * [1,15,6,7,1,7]  return 1;
     */
    public static void main(String[] args) {
        int[] nums = {1,15,6,15,1,7};
        System.out.println(findRepeatNumber(nums));
    }

    private static int findRepeatNumber(int[] nums){
        if (nums.length == 0) return -1;
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            //如果直接put 当数据量大的时候可能会超时
            //getOrDefault  根据key来获取值,如果有则直接赋值给当前put的key,没有则使用默认值
            if (m.put(nums[i],m.getOrDefault(nums[1],i)) != null){
                return nums[i];
            }
        }
        return -1;
    }
}
