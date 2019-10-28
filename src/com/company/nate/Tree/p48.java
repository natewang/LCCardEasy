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

        return recursiveBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public static  boolean recursiveBST(TreeNode root, long low, long high) {

        if (root == null) {
            return true;
        }

        if (root.val >= high || root.val <= low) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null && root.right != null) {
            return recursiveBST(root.right, root.val, high);
        }

        if (root.right == null && root.left != null) {
            return recursiveBST(root.left,low, root.val);
        }

        return recursiveBST(root.left,low, root.val) && recursiveBST(root.right, root.val, high);
    }


    public static void main(String[] args) {

        String str = "[1,null,1]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        BTreePrinter.prettyPrintTree(root);

        System.out.println(isValidBST(root));

    }
}
