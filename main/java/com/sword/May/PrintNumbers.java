package main.java.com.sword.May;

import java.util.Arrays;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/3
 */
public class PrintNumbers {
    /**
     * 输入一个整数 打印出从1-n位的最大数
     * n:3 out 1- 999
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }

    private static int[] printNumbers(int n) {
        if (n == 0) return new int[]{};
        int nums = 0;
        while (n > 0) {
            nums = nums * 10 + 9;
            n--;
        }
        int[] res = new int[nums];
        for (int i = 0; i < nums; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
