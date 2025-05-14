import java.util.*;

public class olya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long min = Long.MAX_VALUE;
            long secondminisum =0;
            long secondmini = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                int m = sc.nextInt();
                ArrayList<Integer> v = new ArrayList<>();
                for(int j=0;j<m;j++){
                    v.add(sc.nextInt());
                }

                Collections.sort(v);
                min = Math.min(min,v.get(0) );
                secondminisum += v.get(1);
                secondmini = Math.min(secondmini,v.get(1));
                
            }
            System.out.println(min+secondminisum-secondmini);
            

        }
        sc.close();
    }
} 