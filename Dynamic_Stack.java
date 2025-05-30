import java.util.*;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
public class Dynamic_Stack {
    Node2 front, rear;

    void enqueue(int x){
        Node2 n = new Node2(x);
        if(front == null){
            front = n;
            rear = n;
        }else{
            rear.next = n;
            rear= n;
        }
        System.out.println(x+" Inserted");
    }


    void dequeue(){
        if(front == null){
            System.out.printf("Queue is Empty");
        }else{
            if(front == rear) {
                Node2 temp = front;
                front = rear = null;
            }else{
                Node2 temp = front;
                front = front.next;
                temp.next = null;

            }
            System.out.printf("Deleted");
        }
    }
}
