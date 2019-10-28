package com.company.nate.Tree;

/*给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3
但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3
*/


public class p49 {


    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }


        return isSymmetricTree(root.left, root.right);
    }

    public static boolean isSymmetricTree(TreeNode node_1, TreeNode node_2) {

        if (node_1 == null && node_2 == null) {
            return true;
        }

        if (node_1 == null || node_2 == null) {
            return false;
        }

        if (node_1.val != node_2.val) {
            return false;
        }

        return isSymmetricTree(node_1.left, node_2.right) && isSymmetricTree(node_1.right, node_2.left);
    }


    public static void main(String[] args) {

        String str = "[1,2,2,3,4,4,3]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        BTreePrinter.prettyPrintTree(root);

        System.out.println(isSymmetric(root));

    }

}
