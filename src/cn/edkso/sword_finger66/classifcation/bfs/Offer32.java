package cn.edkso.sword_finger66.classifcation.bfs;

import java.util.*;

public class Offer32{

    int count = 0;
    public int[] levelOrder(TreeNode root) {

        if (root == null){
            return new int[0];
        }

        dfs(root);


        int[] res = new int[count];
        int i = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            if (queue.peek().left != null){
                queue.add(queue.peek().left);
            }
            if (queue.peek().right != null){
                queue.add(queue.peek().right);
            }
            res[i++] = queue.poll().val;
        }
        return res;
    }

    public void dfs(TreeNode root){
        if (root != null){
            count ++;
            dfs(root.left);
            dfs(root.right);
        }
    }
}