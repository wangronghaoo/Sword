package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/28
 */
public class CanPlaceFlowers {
    /**
     * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     *
     * 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，
     * 能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,0,0};
        System.out.println(canPlaceFlowers(nums,3));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //三个0可以中一朵花
        //给边界添0,如果前俩个是0,则也可以种花,所以初始为1
        int count_0 = 1,num = 0;
        for(int i = 0; i < flowerbed.length;i++){
            if(flowerbed[i] == 0){
                count_0++;
            }else{
                count_0 = 0;
            }
            //三个0表示可以种花
            if(count_0 == 3){
                num++;
                //0的个数归1
                count_0 = 1;
            }
        }
        //遍历完成,最后一个0的位置
        if(count_0 == 2){
            num++;
        }
        return num >= n;
    }
}
