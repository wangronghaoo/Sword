package main.java.com.sword.May;



/**
 * @Author: WangRongHao
 * @Date: 2021/5/3
 */
public class DeleteNode {

    /**
     * 给定一个链表的头节点,根据目标值将头节点所对应的val删除
     * [1,4,5,9] [1,4,9]
     */
    private static class ListNode{
        private int val;
        private ListNode next;

        private ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode newL = deleteListNode(l1,5);
        while (newL != null){
            System.out.println(newL.val);
            newL = newL.next;
        }

    }

    private static ListNode deleteListNode(ListNode head, int val){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (pre.next != null){
            //如果找到了就将next替换为next.next
            if (pre.next.val == val){
                pre.next = pre.next.next;
                break;
            }
            pre = pre.next;
        }
        return dummyHead.next;
    }
}
