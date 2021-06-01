package main.java.com.sword.June;

/**
 * @Author: WangRongHao
 * @Date: 2021/6/1
 */
public class CanThreePartsEqualSum {
    /**
     * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
     *
     * 形式上，如果可以找出索引 i+1 < j 
     * 且满足 A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 
     * 就可以将数组三等分。
     */
    public static void main(String[] args) {
        int[] nums ={0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(nums));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        //首先该数组是否可以被分成三部分
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        if(sum % 3 != 0) return false;
        //获取各部分的值
        int target = sum / 3;
        int count = 0,partSum = 0;
        //当被组成的部分大于等于三即可返回true
        for(int i = 0 ; i < arr.length;i++){
            partSum += arr[i];
            if(partSum == target){
                count++;
                partSum = 0;
            }
        }
        return count >= 3;
    }
}
