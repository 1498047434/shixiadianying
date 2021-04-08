package cn.edkso.sword_finger66.classifcation.binarytree;

public class Offer68_2 {
    //利用二叉搜索树的性质
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            }else if (root.val > p.val && root.val > q.val) {
                root = root.left;
            }else {
                return root;
            }
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return laterDfs(root,p,q);
    }
    //时间复杂度0（n）,但是需要完全遍历二叉树，并没有用到二叉树的性质
    //但是这道题适用于Offer68_2 ,非二叉搜索树
    public TreeNode laterDfs(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return null;
        }
        if (root.val == p.val){
            return root;
        }
        if (root.val == q.val){
            return root;
        }
        TreeNode leftChild = laterDfs(root.left, p, q);
        TreeNode rightChild = laterDfs(root.right, p, q);
        if (leftChild != null && rightChild != null){
            return root;
        }
        if (leftChild != null){
            return leftChild;
        }
        if (rightChild != null){
            return rightChild;
        }
        return null;
    }

    public static void main(String[] args) {
        //,,,,,,,null,null,3,5
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;

        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(4);
        node2.left = node4;
        node2.right = node5;

        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(9);
        node3.left = node6;
        node3.right = node7;

        TreeNode node8 = null;
        TreeNode node9 = null;
        node4.left = node8;
        node4.right = node9;

        TreeNode node10 = new TreeNode(3);
        TreeNode node11 = new TreeNode(5);
        node5.left = node10;
        node5.right = node11;
        Offer68_1 off = new Offer68_1();
        TreeNode treeNode = off.lowestCommonAncestor(node1, node2, node3);
        TreeNode treeNode1 = off.lowestCommonAncestor(node1, node2, node5);
        System.out.println(treeNode.val);
        System.out.println(treeNode1.val);

        //,,,,,,,null,null,3,5
        TreeNode node101 = new TreeNode(3);
        TreeNode node202 = new TreeNode(1);
        TreeNode node303 = new TreeNode(4);
        node101.left = node202;
        node101.right = node303;

        TreeNode node404 = null;
        TreeNode node505 = new TreeNode(2);
        node202.left = node404;
        node202.right = node505;
        TreeNode treeNode2 = off.lowestCommonAncestor(node101, node505, node303);
    }
}
