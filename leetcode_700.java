import javax.swing.tree.TreeNode;

public class leetcode_700 {
    public static class TreeNode {
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

    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode ans = search(root,val);
        return ans;
    }

    private static TreeNode search(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }else if(val<root.val){
            return search(root.left,val);
        }else{
            return search(root.right, val);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode ans = searchBST(root,val); 
        System.out.println(ans.val);
    }
}
