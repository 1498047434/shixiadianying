package cn.edkso.sword_finger66.classifcation.stackAndQueue;

import java.util.Stack;

public class Offer06 {

    public  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }

    public int[] reversePrint(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.add(head);
            head = head.next;
        }

        int[] arr = new int[stack.size()];

        int i = 0;
        while (!stack.empty()){
            arr[i++] = stack.pop().val;
        }

        return arr;
    }

    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        node1.next = node2;
//        int[] res = reversePrint(node1);
//        for (int re : res) {
//            System.out.println(re);
//        }
    }
}
