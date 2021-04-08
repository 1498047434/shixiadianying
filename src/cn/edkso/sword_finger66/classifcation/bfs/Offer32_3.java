package cn.edkso.sword_finger66.classifcation.bfs;

import java.util.*;

public class Offer32_3 {

    // 双端队列
    // 当前队列的长度 = len，就是这一层节点数，  【替换从队列，前还是后,判断条件 flag = flase/true】,
    // 并且
    // 若从前，加入的时候先加左，从后端加
    // 若从后，加入的时候先加右，从前端加
    // for(len)把这一层节点 放入list，同时把节点的左右节点加入队列，下次循环如此
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        List<Integer> list = new ArrayList<>();
        boolean flag = true;  // true 从队列前端开始/ fase 从队列后端开始

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int len = deque.size();
            if (flag){
                for (int i = 0; i < len; i++) {
                    TreeNode node = deque.pollFirst();
                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                    list.add(node.val);
                }

            }else{
                for (int i = 0; i < len; i++) {
                    TreeNode node = deque.pollLast();
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }

                    list.add(node.val);
                }
            }
            flag = !flag;
            res.add(list);
            list = new ArrayList<>();
        }
        return res;
    }
}
