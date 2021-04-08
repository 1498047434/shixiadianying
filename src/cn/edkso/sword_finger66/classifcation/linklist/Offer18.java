package cn.edkso.sword_finger66.classifcation.linklist;







public class Offer18 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // head -> p1 -> p2 -> p3 ->p4
    public ListNode deleteNode(ListNode head, int val) {

        ListNode pre = new ListNode(0);
        ListNode pre2 = pre;


        pre.next = head;
        while (pre.next != null){
            if (pre.next.val == val){
                pre.next = pre.next.next;
                break;
            }
            pre = pre.next;
        }

        return pre2.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode node = new Offer18().deleteNode(node1, 5);
        System.out.println("jieshu");
    }
}
