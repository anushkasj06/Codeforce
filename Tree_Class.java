import java.util.Scanner;

class Nodet {
    int data;
    Nodet left, right;

    Nodet(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree_Class {
    private Nodet root;

    // Insertion using recursion
    void insert(int data) {
        root = insertRec(root, data);
    }

    private Nodet insertRec(Nodet root, int data) {
        if (root == null) {
            root = new Nodet(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Inorder traversal
    void inorder() {
        System.out.print("Inorder Traversal: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Nodet root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    private void count_node(Nodet root, int count){
        if(root!=null){
            count_node(root.left,count);
            count++;
            count_node(root.right,count);
        }
        System.out.println(count);
    }

    private void count_leafnode(Nodet root, int count){
        if(root!=null){
            count_leafnode(root.left,count);
            if(root.left==null && root.right==null){
                count++;
            }
            count_leafnode(root.right,count);
        }
        System.out.println(count);

    }

    private boolean search(Nodet root, int key){
        if(root == null) {
            return false;
        }else{
            if(key < root.data){
                return search(root.right, key);
            }else if (key > root.data){
                return search(root.right, key);
            }else{
                return true;
            }
        }
    }

    private int count_height(Nodet root){
        if(root==null){
            return 0;
        }
        int left_height = count_height(root.left);
        int right_height = count_height(root.right);
        return Math.max(left_height,right_height)+1;
        
    }

    private void onltleftsubtree(Nodet root){
        if(root == null){
            return;
        }
        onltleftsubtree(root.left);
        System.out.print(root.data);
    }

    private boolean isvalidbst(Nodet root){
        if(root == null){
            return true;
        }
        if(root.left!= null && root.left.data > root.data){
            return false;
        }
        if(root.right !=null && root.right.data < root.data){
            return false;
        }
        return isvalidbst(root.left) && isvalidbst(root.right);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tree_Class t = new Tree_Class();

        while (true) {
            System.out.println("\n1. Insert\n2. Traversal (Inorder)\n 3.exit 4. count nodes 5. count leaf node 6.count height 7.search");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value you want to insert: ");
                    int x = in.nextInt();
                    t.insert(x);
                    break;
                case 2:
                    t.inorder();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                case 4:
                    t.count_node(t.root,0);
                    break;
                case 5:
                    t.count_leafnode(t.root,0);
                    break;
                
                case 6:
                    System.out.println(t.count_height(t.root));
                    break;
                case 7:
                    System.out.print("Enter the value you want to search: ");
                    int key = in.nextInt();
                    if(t.search(t.root,key)){
                        System.out.println("Found");
                    }else{
                        System.out.println("Not Found");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
