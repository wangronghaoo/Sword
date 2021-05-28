package main.java.com.sword.May;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/28
 */
public class CanPlaceFlowers {
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
