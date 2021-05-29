package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/29
 */
public class ContainsNearbyDuplicate {
    /**
     * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
     * 使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums,2));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0,j = nums.length - 1;
        while(i <= j){
            if (i == j){
                break;
            }
            int temp = nums[i];
            if(temp == nums[j]) {
                //最后一位相等,但是k不符合,就让它寻找下一个
                if (j - i <= k) return true;
                else j--;
            }
            if(nums[j] != temp) j--;
            if(j == i){
                i++;
                j = nums.length - 1;
            }
        }
        return false;
    }
}
