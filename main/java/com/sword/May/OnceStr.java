package main.java.com.sword.May;

import java.util.*;

/**
 * @Author: WangRongHao
 * @Date: 2021/5/6
 */
public class OnceStr {
    /**
     * 给定一个字符串s,找出第一个只出现一次的字符
     * 没有则返回单空格
     * s只包括小写字母
     */
    public static void main(String[] args) {
        String s = "gabedcabdecf";
        System.out.println(onceStr(s));
    }


    private static char onceStr(String s){
        if (s.length() == 0 ) return ' ';
        //用于存储各个字符的个数
        Map<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            //如果个数 > 1则将该字符删除
            //否则加入列表
            //直接返回第一个
            if (map.getOrDefault(s.charAt(i),0) > 1){
                list.remove(list.indexOf(s.charAt(i)));
            }else {
                list.add(s.charAt(i));
            }
        }
        return list.get(0);
    }
}
