package cn.edkso.sword_finger66.classifcation.dfs;


public class Offer27 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
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
}
