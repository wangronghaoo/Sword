package main.java.com.sword.April;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/28
 */
public class ReplaceSpace {
    /**
     * 将指定字符中的空格替换成"%20"
     */

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We are happy.")));
        System.out.println(appendString(new StringBuffer("We are happy.")));
    }

    //直接调用api返回
    private static String replaceSpace(StringBuffer str){
        return str.toString().replace("\u0020","%20");
    }

    //拼接字符串
    private static String appendString(StringBuffer str){
        String s = str.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\u0020'){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
