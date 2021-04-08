package cn.edkso.sword_finger66.classifcation.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32_2 {


    // 当前队列的长度 = len，就是这一层节点数，   for(len) 把这一层节点 放入list，同时把节点的左右节点加入队列，下次循环如此
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                list.add(queue.poll().val);
            }
            res.add(list);
            list = new ArrayList<>();
        }
        return res;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue.add(root);

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){
            if (queue.peek().left != null){
                queue2.add(queue.peek().left);
            }
            if (queue.peek().right != null){
                queue2.add(queue.peek().right);
            }
            list.add(queue.poll().val);
            if (queue.isEmpty()){
                res.add(list);
                list = new ArrayList<>();
                while (!queue2.isEmpty()){
                    queue.add(queue2.poll());
                }
            }
        }

        return res;
    }
}
