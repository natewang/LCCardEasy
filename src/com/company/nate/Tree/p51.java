package com.company.nate.Tree;

public class p51 {

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        return BST(nums, 0, nums.length - 1);
    }

    public static TreeNode BST(int[] nums, int low, int high) {

        if (low > high) {
            return null;
        }

        int mid = (high - low) / 2 + low;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = BST(nums,low, mid-1);
        node.right = BST(nums, mid+1, high);
        return node;
    }

    public static void main(String[] args) {

        String str = "[3,9,20,null,null,15,7]";
        TreeNode root = BTreePrinter.stringToTreeNode(str);

        int[] arr = {-10,-3,0,5,9};

        BTreePrinter.prettyPrintTree(sortedArrayToBST(arr));

    }

}
