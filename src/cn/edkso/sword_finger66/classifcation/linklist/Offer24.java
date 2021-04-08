package cn.edkso.sword_finger66.classifcation.linklist;

public class Offer24 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = head;
        ListNode pos;
        ListNode rear = head.next;

        while (rear != null){
            pos = rear;
            rear = rear.next;
            pos.next = pre;
            pre = pos;
        }

        head.next =null;

        return pre;
    }
}
