import javax.swing.tree.TreeNode;

public class leetcode_617 {

    public class TreeNode {
      int val;
    TreeNode left;
     TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
         this.right = right;
     }
 }


     public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }else if(root1 == null){
            return root2;
        }else if(root2 == null){
            return root1;
        }

        TreeNode root = new TreeNode(root1.val + root2.val);

        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;

    }
    public static void main(String[] args) {
        leetcode_617 solution = new leetcode_617();
        // Example usage:
        TreeNode tree1 = solution.new TreeNode(1, 
            solution.new TreeNode(3, solution.new TreeNode(5), null), 
            solution.new TreeNode(2));
        
        TreeNode tree2 = solution.new TreeNode(2, 
            solution.new TreeNode(1, null, solution.new TreeNode(4)), 
            solution.new TreeNode(3, null, solution.new TreeNode(7)));
        
        TreeNode mergedTree = solution.mergeTrees(tree1, tree2);
        // You can add code here to print or verify the merged tree.
        // Example usage
        System.out.println("Merged tree root value: " + mergedTree.val);
        System.out.println("Merged tree left child value: " + mergedTree.left.val);
        System.out.println("Merged tree right child value: " + mergedTree.right.val);
        System.out.println("Merged tree left-left child value: " + mergedTree.left.left.val);


        System.out.println("Merged tree left-right child value: " + mergedTree.left.right); // Should be null


        System.out.println("Merged tree right-left child value: " + mergedTree.right.left); // Should be null

        System.out.println("Merged tree right-right child value: " + mergedTree.right.right.val);
        // Should be 7

        System.out.println("Merged tree left-left child value: " + mergedTree.left.left.val); // Should be 5
    }
}
