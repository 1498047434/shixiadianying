package cn.edkso.sword_finger66.classifcation.dfs;

public class Offer55 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        int res = dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}
