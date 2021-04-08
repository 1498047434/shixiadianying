package cn.edkso.sword_finger66.classifcation.linklist;

public class Offer52 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int aLen = 0;
        int bLen = 0;
        ListNode listA = headA;
        ListNode listB = headB;

        while (listA != null){
            aLen ++;
            listA = listA.next;
        }
        while (listB != null){
            bLen ++;
            listB = listB.next;
        }

        if (aLen > bLen){
            for (int i = 0; i < aLen - bLen; i++) {
                headA = headA.next;
            }
        }
        if (bLen > aLen){
            for (int i = 0; i < bLen - aLen; i++) {
                headB = headB.next;
            }
        }
        while (headA != null){
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Offer52 off = new Offer52();

        ListNode node4 = new ListNode(8);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        node4.next = node5;
        node5.next = node6;

        ListNode node11 = new ListNode(4);
        ListNode node12 = new ListNode(1);
        node11.next = node12;
        node12.next = node4;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(1);
        ListNode node23 = new ListNode(0);
        node21.next = node22;
        node22.next = node23;
        node23.next = node4;
        off.getIntersectionNode(node11,node21);
    }
}
