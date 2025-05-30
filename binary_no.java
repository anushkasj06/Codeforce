import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class binary_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n>0){
            String f = q.poll();
            q.add(f+"0");
            q.add(f+"1");
            System.out.println(f);
            n--;
        }
            
       
    }
}
