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
    public boolean evaluateTree(TreeNode root) {

        //returning boolean value if 1 then true otherwise false
        if ( root.left == null && root.right == null ){
            return root.val == 1;
        }

        //recursively traversing over left and right nodes
        boolean left = evaluateTree( root.left );
        boolean right = evaluateTree( root.right );
        
        //for OR
        if( root.val == 2 ){
            return left || right;
        }

        //For AND
        return left && right;    
    }
}