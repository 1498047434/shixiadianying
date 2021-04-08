package cn.edkso.sword_finger66.classifcation.dfs;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class Offer28 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public boolean isSymmetric2(TreeNode root) {
        if (root == null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }
    public boolean isMirrorTree(TreeNode r1, TreeNode r2) {
        if ((r1 == null && r2 != null) || (r1 != null && r2 == null)){
            return false;
        }
        if (r1 == null && r2 == null){
            return true;
        }
        if (r1.val == r2.val){
            return isMirrorTree(r1.right, r2.left) && isMirrorTree(r1.left, r2.right);
        }
        return false;
    }








    public boolean isSymmetric(TreeNode root) {
        TreeNode root1 = dfsCreate(root);
        root1 = mirrorTree(root1);

        return dfsCompare(root, root1);
    }

    private boolean dfsCompare(TreeNode root, TreeNode root1) {
        if ((root == null && root1 != null) || (root != null && root1 == null)){
            return false;
        }
        if (root == null && root1 == null){
            return true;
        }
        if (root.val == root1.val){
            return dfsCompare(root.left,root1.left) && dfsCompare(root.right,root1.right);
        }
        return false;
    }

    public TreeNode mirrorTree(TreeNode root) {
        if ( root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }

    public TreeNode dfsCreate(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        node.left = dfsCreate(root.left);
        node.right = dfsCreate(root.right);
        return node;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        node3.left = node6;
        node3.right = node7;

        boolean res = new Offer28().isSymmetric2(node1);
        System.out.println(res);
    }
}
