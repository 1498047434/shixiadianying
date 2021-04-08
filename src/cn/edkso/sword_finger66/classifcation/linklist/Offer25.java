package cn.edkso.sword_finger66.classifcation.linklist;

public class Offer25 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode temp;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null){
            if (p1.val <= p2.val && p1.next != null  && p1.next.val <= p2.val){
                p1 = p1.next;
            }else if (p2.val <= p1.val && p2.next != null && p2.next.val <= p1.val){
                p2 = p2 .next;
            } else if (p1.val <= p2.val){
                temp = p1.next;
                p1.next = p2;
                p1 = temp;
            }else{
                temp = p2.next;
                p2.next = p1;
                p2 = temp;
            }
        }

        if (l1.val <=  l2.val){
            return l1;
        }else{
            return l2;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        return mergeTwoListsFun( l1,  l2);
    }

    private ListNode mergeTwoListsFun(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        if (l1.val <= l2.val){
            l1.next = mergeTwoListsFun(l1.next ,l2);
            return l1;
        }else{
            l2.next = mergeTwoListsFun(l1 ,l2.next);
            return l2;
        }
    }


}
