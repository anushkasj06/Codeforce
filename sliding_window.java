import java.util.ArrayList;
import java.util.Scanner;

public class sliding_window {

    public static void slid_wind(int[] queue, int window_size){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<queue.length-window_size; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+window_size;j++){
                max = Math.max(max,queue[j]);
            }
            list.add(max);
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int queue[] = {12,2,55,3,88,9,33,77,99,22};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the window Size");
        int window_size = in.nextInt();
        slid_wind(queue,window_size);
    }
}
