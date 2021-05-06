package main.java.com.sword.May;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/6
 */
public class MajorityElement {
    /**
     * 给定一个数组,其中有一个元素的个数超过了数组长度的一半,寻找该元素并返回
     */
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement2(nums));
    }

    /**
     * HashMap
     * 将数组中的每一个元素都存储,如果已经存在则value+1
     */
    private static int majorityElement(int[] nums) {
        if (nums.length == 0) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

    /**
     * 摩尔投票法
     * 1.设定一个 x = num
     * 2.遍历元素,相等+1,否则-1
     * 3.多的就是众数
     */
    private static int majorityElement2(int[] nums) {
        if (nums.length == 0) return -1;
        int x = 0 , votes = 0;
        for (int num : nums) {
            if ( votes == 0 ) x = num;
            votes += x == num ? 1 : -1;
        }
        return x;
    }
}
