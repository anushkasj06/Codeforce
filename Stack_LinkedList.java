import java.util.*;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class Stack_LinkedList {
    Node1 tos;
    void push(int x){
        Node1 n = new Node1(x);
        if(tos == null){
            tos = n;
        }else{
            n.next = tos;
            tos = n;
        }
        System.out.printf(x+" Inserted");
    }


    void pop(){
        if(tos == null){
            System.out.printf("Stack is Empty");
        }else{
            Node1 temp = tos;
            if(temp.next == null){
                tos = null;
            }else {
                tos = tos.next;
            }
            temp.next = null;
            System.out.printf(temp.data+" Deleted");
        }
    }

    void print(){
        if(tos == null){
            System.out.printf("Stack is Empty");
        }else{
            Node1 temp = tos;
            while(temp!= null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack_LinkedList list = new Stack_LinkedList();
        list.push(2);
        list.push(3);
        list.push(6);
        list.print();
        list.pop();
        list.pop();
        list.print();
    }
}

