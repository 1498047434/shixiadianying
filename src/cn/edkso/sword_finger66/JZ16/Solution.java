package cn.edkso.sword_finger66.JZ16;

/**
 * 《合并两个排序的链表》
 *
 * 题目描述：
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * 示例1
 * 输入
 * {1,3,5},{2,4,6}
 *
 * 返回值
 * {1,2,3,4,5,6}
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {

        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
//        ListNode head = null;
        if (list1.val <= list2.val){
//            head = list1;
//            head.next = Merge(list1.next,list2);
            list1.next = Merge(list1.next,list2);
            return list1;
        }else {
//            head = list2;
//            head.next = Merge(list1,list2.next);
            list2.next = Merge(list1,list2.next);
            return list2;
        }
//        return head;
    }

}
