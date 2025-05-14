import java.util.*;

public class Monster {

    static class  Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int num = a%k;
                if(num==0){
                    arr[i] =k;
                }else{
                    arr[i] = num;
                }
            }

            ArrayList<Pair> v = new ArrayList<>();
            for(int i=0;i<n;i++){
                v.add(new Pair(-arr[i],i));
            }

            Collections.sort(v,(a,b)->a.first-b.first);

            for(int i=0;i<n;i++){
                System.out.print(v.get(i).second+1+" ");
            }


        }
        
    }
}
