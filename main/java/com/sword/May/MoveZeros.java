package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/26
 */
public class MoveZeros {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    private static void moveZeroes(int[] nums) {
        int left = 0,right = 1;
        while(left <= nums.length - 1 && right <= nums.length - 1){
            //只有当left==0，right!= 0 进行替换
            if(nums[left] == 0 && nums[right] != 0){
                int temp = nums[right];
                nums[right++] = 0;
                nums[left++] = temp;
            }else if(nums[left] == 0){
                //如果left为0,则right++,分别与每一个right比较
                right++;
            } else if(nums[left] != 0){
                ////不为0,left++,right++,否则left=right
                left++;
                right++;
            }
        }
    }
}
