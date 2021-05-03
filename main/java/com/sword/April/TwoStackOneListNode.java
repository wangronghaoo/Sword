package main.java.com.sword.April;

import java.util.Stack;

/**
 * @Author: WangRongHao
 * @Date: 2021/4/29
 */
public class TwoStackOneListNode {
    /**
     * 使用俩个栈维护一个队列,分别实现从头部删除元素和尾部添加元素函数
     */
    private static class CQueue {
        private Stack<Integer> appendStack;
        private Stack<Integer> deleteStack;

        /**
         * 构造初始化
         */
        private CQueue() {
            appendStack = new Stack<>();
            deleteStack = new Stack<>();
        }

        private void appendTail(Integer val) {
            appendStack.push(val);
        }


        private int deleteHead() {

            //不为空,放入到删除的栈中,栈顶则刚刚好是第一次进入的元素
            while (!appendStack.isEmpty()) {
                deleteStack.push(appendStack.pop());
            }
            if (deleteStack.isEmpty()) return -1;
            return deleteStack.pop();
        }

        private Stack<Integer> list() {
            //返回该栈的所有元素
            //插入栈中为空,则将所有删除的栈添加,返回appendStack
            if (appendStack.isEmpty()) {
                while (!deleteStack.isEmpty()) {
                    appendStack.push(deleteStack.pop());
                }
            }
            return appendStack;
        }
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(5);
        queue.appendTail(6);
        queue.appendTail(7);
        queue.appendTail(8);
        System.out.println(queue.list()); //[5, 6, 7, 8]
        queue.deleteHead();
        queue.deleteHead();
        System.out.println(queue.list()); //[7, 8]
        queue.appendTail(10);
        System.out.println(queue.list()); //[7, 8, 10]
        queue.deleteHead();
        queue.deleteHead();
        System.out.println(queue.list()); //[10]
        int i = queue.deleteHead();
        System.out.println(i);
        System.out.println(queue.list()); //[]
    }
}
