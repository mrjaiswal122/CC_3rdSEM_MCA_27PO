/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<List<Integer>> ans = new ArrayList<>();

    public void solve (TreeNode root, int targetSum, int curr, List<Integer> temp) {
        if(root == null)
            return;
        curr += root.val;
        temp.add(root.val);
        if ( root.left == null && root.right == null && curr == targetSum ){
            ans.add(new ArrayList<>(temp));
        }

        solve(root.left, targetSum, curr, temp);
        // temp.remove(temp.size()-1);
        
        solve(root.right, targetSum, curr, temp);
        temp.remove(temp.size()-1);



    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        solve(root, targetSum, 0, temp);
        return ans;
    }
}
