package main.java.com.sword.May;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/6
 */
public class LeastNumbers {
    /**
     * 给定一个无序的数组和一个k值,返回该数组最小的k个数
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,7,9,4,2};
        System.out.println(Arrays.toString(findSmallest(nums,6)));
        System.out.println(Arrays.toString(findSmallest2(nums,6)));

    }

    /**
     * 将数组排序之后,直接返回前k个
     * @param nums
     * @param k
     * @return int[
     */
    private static int[] findSmallest(int[] nums,int k){
        if (nums.length <= 1) return nums;
        Arrays.sort(nums);
        return Arrays.copyOfRange(nums,0,k);
    }

    //优先队列
    //存放进去的元素都是从小-大的,相当于插入正确位置
    //remove是从第一个开始删除
    private static int[] findSmallest2(int[] nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.remove();
        }
        return res;
    }
}
