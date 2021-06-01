package main.java.com.sword.June;

/**
 * @Author: WangRongHao
 * @Date: 2021/6/1
 */
public class FindPoisonedDuration {
    /**
     * 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。现在，给出提莫对艾希的攻击时间序列和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。
     *
     * 你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(findPoisonedDuration(nums,5));
    }
    private static int findPoisonedDuration(int[] timeSeries, int duration) {
        int dura = 0;
        //如果开始的时间+持续时间是小于下一次攻击的时间
        //持续时间 = 持续时间 + duration
        //否则持续时间就等于下一次开始攻击的时间 - 本次攻击时间
        for(int i = 0; i < timeSeries.length - 1;i++){
            if(timeSeries[i] + duration < timeSeries[i + 1]){
                dura += duration;
            }else{
                dura += timeSeries[i + 1] - timeSeries[i];
            }
        }
        //再给最后一次的攻击+持续时间
        dura += duration;
        return dura;
    }
}
