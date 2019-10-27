

package com.company.nate.Tree;


/*
给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。
* */



public class p47 {


    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;

        return Math.max(left, right);
    }




    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        TreeNode tree_1 = new TreeNode(9);
        TreeNode tree_2 = new TreeNode(20);

        root.left = tree_1;
        root.right = tree_2;

        TreeNode tree_3 = new TreeNode(15);
        TreeNode tree_4 = new TreeNode(7);

        tree_2.left = tree_3;
        tree_2.right = tree_4;

        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);


        TreeNode node = BTreePrinter.stringToTreeNode("[3, 9, 20, null, null, 15, 7]");
        BTreePrinter.prettyPrintTree(node);
    }

}
