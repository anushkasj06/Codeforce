import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class leetcode_653{
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
    HashSet<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        traversal(root);
        for(int i=0;i<list.size();i++){
            int rem = k- list.get(i);
            if(rem!= list.get(i) && set.contains(rem)){
                return true;
            }
        }
        return false;
    }

    private void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        set.add(root.val);
        list.add(root.val);
        traversal(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        leetcode_653 sol = new leetcode_653();
        System.out.println(sol.findTarget(root, 9));
        System.out.println(sol.findTarget(root, 28));
    }
}