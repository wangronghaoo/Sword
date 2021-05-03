package main.java.com.sword.April;


import java.util.Arrays;
import java.util.Stack;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/29
 */
public class PrintListNode {
    /**
     * 给定一个链表的head 从尾部开始打印链表
     * [1,4,5] return [5,4,1]
     */
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        System.out.println(Arrays.toString(printListNode(l1)));
    }

    private static int[] printListNode(ListNode listNode){
        //先进后出使用Stack
        Stack<ListNode> stack = new Stack<>();
        //获取ListNode的next个数,并且创建数组依次存入
        int count = 0;
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
            count++;
        }
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }
}
