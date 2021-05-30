package main.java.com.sword.May;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/30
 */
public class SummaryRanges {
    /**
     * 给定一个无重复元素的有序整数数组 nums 。
     * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
     */
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> list = summaryRanges(nums);
        for (String s : list) {
            System.out.println(s);
        }
    }
    private static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]){
                StringBuilder sb = new StringBuilder();
                sb.append(nums[i]);
                if (i != j){
                    sb.append("->").append(nums[j]);
                }
                res.add(sb.toString());
                i = j + 1;
            }
        }
        return res;
    }
}
