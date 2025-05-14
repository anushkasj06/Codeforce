import java.util.*;

public class B_Valerii_Against_Everyone{
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashSet<Integer> hs = new HashSet<>();
            boolean isPresent = false;
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                if(hs.contains(a)){
                    isPresent = true;
                }
                hs.add(a);
            }
            if(isPresent){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}