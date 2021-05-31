package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/31
 */
public class SmallerNumbersThanCurrent {

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     *
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
     *
     * 以数组形式返回答案。
     */
    public static void main(String[] args) {
        int[] nums = {8,7,6,5};
        int[] res = smallerNumbersThanCurrent(nums);
        for (int re : res) {
            System.out.println(re);
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        /**
         * 桶思想：
         *
         * 定义一排桶 int arr[101] , 其中 arr[i] 里存放数字 n 出现的次数
         * 遍历 nums，初始化桶数组 arr
         * 累加处理桶数组arr ， 使得 arr[i] 表示比 i 小的数字的个数
         * 最后遍历 nums ，取出对应桶里的结果即可。
          */
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }
        return ret;
    }
}
