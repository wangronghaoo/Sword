package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/29
 */
public class Search {
    /**
     * 统计一个数字在排序数组中出现的次数。
     */
    public static void main(String[] args) {
        int[] nums = {5,6,6,6,7,8};
        System.out.println(search(nums,6));
    }

    private static int search(int[] nums, int target) {
        if(nums.length == 0) return 0;
        //二分法
        int l = 0,r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else {
                if(nums[r] != target){
                    r--;
                }else if(nums[l] != target){
                    l++;
                }else {
                    break;
                }
            }
        }
        return r- l + 1;
    }
}
