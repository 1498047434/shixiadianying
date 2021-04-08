package cn.edkso.sword_finger66.classifcation.dfs;

import java.util.Stack;

public class Offer54 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int count = 0;
    public int res;
    //先遍历右边，再遍历中，再遍历左
    public int kthLargest1(TreeNode root, int k) {
        dfsRightToMidToLeft(root,k);
        return res;
    }

    public void dfsRightToMidToLeft(TreeNode root,int k){
        if (root != null){
            dfsRightToMidToLeft(root.right,k);
            count ++;
            if (count == k){
                res = root.val;
                return;
            }
            dfsRightToMidToLeft(root.left,k);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);

        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        node2.left = node4;
        node2.right = node5;

//        node3.left = null;
//        node3.right = null;
        
        TreeNode node6 = new TreeNode(1);
        node4.left = node6;
        node4.right = null;


        int res = new Offer54().kthLargest1(node1,3);
        System.out.println(res);
    }

    //先序遍历，放入栈，弹出，第k个返回
    public int kthLargest(TreeNode root, int k) {
        Stack<Integer> stack = new Stack<>();
        midDfs(root,stack);
        for (int i = 0; i < k; i++) {
            if (i == k-1){
                return stack.pop();
            }else{
                stack.pop();
            }
        }
        return 0;
    }

    public void midDfs(TreeNode root, Stack stack){
        if (root != null){
            midDfs(root.left,stack);
            stack.add(root.val);
            midDfs(root.right,stack);
        }
    }
}
