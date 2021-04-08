package cn.edkso.sword_finger66.JZ17;

/**
 * 《树的子结构》
 *
 * 题目描述：
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * 示例1
 * 输入
 * {8,8,#,9,#,2,#,5},{8,9,#,2}
 *
 * 返回值
 * true
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

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false; //根据题意任何一个树为空，都不成立
        }
        if (root1.val == root2.val){ //如果root1当前节点和root2节点相同，那么开始进行对比，通过isEqualsTree方法
            return isEqualsTree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public boolean isEqualsTree(TreeNode root1, TreeNode root2){
        if (root2 == null){ //如果root2第一次过来一定不为空，如果root2为空了 说明当前root2子树与roo1子树相同
            return true;
        }
        if (root1 == null){ //到了这一步，说明root2子结构还没遍历完，roo1为空了，说明roo2肯定不是root1子结构了
            return false;
        }


        if (root1.val != root2.val){ //如果root1的当前结点 和root2的当前结点 不等，没有遍历下去的必要了，false
            return false;
        }else{
            //再判断当前root2的左子树是否是当前roo1节点的左子树的子树 和右子树的子树
            return isEqualsTree(root1.left,root2.left) && isEqualsTree(root1.right,root2.right);
        }
    }
}
