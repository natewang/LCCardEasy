package com.company.nate.Tree;

/*
给定一个二叉树，判断其是否是一个有效的二叉搜索树。

假设一个二叉搜索树具有如下特征：

节点的左子树只包含小于当前节点的数。
节点的右子树只包含大于当前节点的数。
所有左子树和右子树自身必须也是二叉搜索树。
示例 1:

输入:
    2
   / \
  1   3
输出: true
 */


public class p48 {

    public static boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        return recursiveBST(root.left, root.val, true) && recursiveBST(root.right, root.val, false);

    }

    public static  boolean recursiveBST(TreeNode root, int lastVal, boolean inLeft) {

        if (root == null) {
            return true;
        }

        if (inLeft && root.val >= lastVal) {
            return false;
        }

        if (!inLeft && root.val <= lastVal) {
            return false;
        }

        if (root.left != null && (root.left.val >= root.val || root.left.val <= lastVal)) {
            return false;
        }

        if (root.right != null && (root.right.val <= root.val || root.right.val >= lastVal)) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {

        String str = "[5,1,4,null,null,3,6]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        BTreePrinter.prettyPrintTree(root);

        System.out.println(isValidBST(root));

    }
}
