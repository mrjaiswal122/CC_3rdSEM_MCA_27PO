/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(in t x) { val = x; }
 * }
 */
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/2197915348/
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val ==p.val || root.val == q.val  )
            return root;
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if(leftNode == null){
            return rightNode;
        }
        else if ( rightNode == null){
            return leftNode;
        }
        else{
            return root;
        }
    }
}
