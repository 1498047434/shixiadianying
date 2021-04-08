package cn.edkso.sword_finger66.JZ18;

/**
 * 《二叉树的镜像》
 *
 * 题目描述：
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 比如：    源二叉树
 *             8
 *            /  \
 *           6   10
 *          / \  / \
 *         5  7 9 11
 *         镜像二叉树
 *             8
 *            /  \
 *           10   6
 *          / \  / \
 *         11 9 7  5
 * 示例1
 * 输入
 * {8,6,10,5,7,9,11}
 *
 * 返回值
 * {8,10,6,11,9,7,5}
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null){
            return null;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = Mirror(temp);
        return pRoot;
    }
}
