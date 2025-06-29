import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_Class {
    Node root;

    void insertLeft(int data){
        Node n = new Node(data);
        if(root ==  null){
            root = n;
        }else{
            n.next = root;
            root = n;
        }
        System.out.println(data+" inserted");
    }

    void deleteLeft(){
        if(root == null){
            System.out.println("Empty linked list");
        }else{
            Node temp = root;
            root = root.next;
            temp.next= null;
            System.out.println(temp.data+" deleted");

        }
    }

    void InsertRight(int data){
        Node n = new Node(data);
        if(root == null){
            root = n;
        }else{
            Node temp = root;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println(data+" inserted");
    }

    void DeleteRight(){
        if(root == null){
            System.out.println("Empty linked list");
        }else{
            Node curr = root;
            Node prev = null;
            while(curr.next!=null){
                prev = curr;
                curr = curr.next;
            }
            if(curr == root){
                root = null;
            }else {
                prev.next = null;
            }
            System.out.println(curr.data+" deleted");

        }
    }

    void printlist(){
        if(root == null){
            System.out.println("Empty linked list");
        }
        else{
            Node temp = root;
            while(temp!=null){
                System.out.println("| "+temp.data+" |-> ");
                temp = temp.next;
            }
        }
    }

    boolean search(int x){
        if(root == null){
            System.out.println("Empty linked list");
            return false;
        }
        else{

            Node temp = root;
            while(temp!=null) {
                if (temp.data == x) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    void delete(int x){
        boolean found = false;
        if(root == null){
            System.out.println("Empty linked list");
        }else{
            Node curr = root;
            Node prev = null;
            while(curr!=null){
                if(curr.data == x){
                    found = true;
                    if(curr== root){
                        root = root.next;
                    }else if(curr== root && curr.next==null){
                        root = null;
                    }
                    else if(curr.next == null){
                        prev.next= null;
                    }else{
                        prev.next = curr.next;
                    }
                    System.out.println(x+ " deleted successfully");
                    break;
                }
                prev = curr;
                curr = curr.next;

            }
            if(!found){
                System.out.printf("Not Found");
            }
        }

    }


    void buublesort(){
        if(root == null){
            System.out.printf("Empty linkedlist");
        }else{
            Node temp = root;

            while(temp.next!=null){
                Node curr = temp.next;
                Node prev = temp;
                while(curr!=null){
                    if(curr.data < prev.data){
                        int p = curr.data;
                        curr.data = prev.data;
                        prev.data = p;
                    }
                }
            }
        }
    }

    void insertionsort(){
        for(Node i = root;i!=null;i=i.next){
            for(Node j= i.next;j!=null;j=j.next){
                if(j.data< i.data){
                    int d = j.data;
                    j.data = i.data;
                    i.data = d;
                }
            }
        }
    }

    void cyclelist(int times){
        if(root == null){
            System.out.printf("Empty Linked List");
        }else{
            while(times>0){
                Node curr, prev;
                curr = prev = root;
                while(curr.next!= null){
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = null;
                curr.next = root;
                root = curr;
                printlist();
                times--;
            }

        }
    }

    void acyclicList(int times){
        if(root == null){
            System.out.printf("Empty Linked List");
        }else{
            while(times>0){
               Node temp  = root;
               root = root.next;
               temp.next = null;
               Node curr, prev;
               curr = prev = root;
               while(curr!=null){
                   prev = curr;
                   curr = curr.next;
               }
               prev.next = temp;
               times--;
            }

        }
    }


    void insertafter(int key, int x){
        if(root== null){
            System.out.printf("Empty Linked LIst so no such key: "+key);
        }else{
            boolean found = false;
            Node curr= root;
            while(curr!=null){
                if(curr.data == key){
                    Node n = new Node(x);
                    n.next = curr.next;
                    found = true;
                    curr.next= n;
                    System.out.printf(x+ "Inserted");
                    break;
                }
                curr = curr.next;
            }
            if(!found){
                System.out.printf(x+" Not Found");
            }
        }
    }

    void comman(LinkedList_Class list1, LinkedList_Class list2 ){
        Node temp = list1.root;
        boolean found = false;
        while(temp!=null){
            int x = temp.data;
            if(list2.search(x)){
                System.out.printf(x+"is Intersection found");
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(!found){
            System.out.printf("no intersection");
        }

    }


}
