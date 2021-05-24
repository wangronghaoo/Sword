package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/24
 */
public class Merge {
    /**
     * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        merge(nums1,3,nums2,3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        //将nums2合并到nums1,然后对nums1进行排序
        System.arraycopy(nums2,0,nums1,m, n);
        for(int i = 0; i < nums1.length - 1;i++ ){
            for(int j = 0; j < nums1.length - i - 1;j++){
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}
