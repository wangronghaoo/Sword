package main.java.com.sword.June;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangRongHao
 * @Date: 2021/6/2
 */
public class CountCharacters {
    /**
     * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
     * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
     * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
     * 返回词汇表 words 中你掌握的所有单词的 长度之和。
     */
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }
    private static int countCharacters(String[] words, String chars) {
        int count = 0,idx = 0;
        //将字母表中字母个数存进去,与字符串数组进行对比,个数大于等于则可以拼成
        //存放的是字母表map
        Map<Character,Integer> m1 = new HashMap<>();
        for(int d = 0; d < chars.length();d++){
            m1.put(chars.charAt(d),m1.getOrDefault(chars.charAt(d),0) + 1);
        }
        //存放每一个单词的字母个数
        Map<Character,Integer> m2 = new HashMap<>();
        while(idx < words.length){
            int len = words[idx].length() - 1;
            boolean isBreak = false;
            for(int d = 0; d <= len;d++){
                m2.put(words[idx].charAt(d),m2.getOrDefault(words[idx].charAt(d),0) + 1);
            }
            while(len >= 0 && !isBreak){
                //如果字母表的个数小于单个字符的个数或者字母表中没有则直接结束
                if(m1.get(words[idx].charAt(len)) == null || m1.get(words[idx].charAt(len)) < m2.get(words[idx].charAt(len--))) isBreak = true;
            }
            //没有结束则count + 字符串的长度
            if(!isBreak) count+=words[idx].length();
            //清空存放单词个数的map
            idx++;
            m2.clear();
        }
        return count;
    }
}
