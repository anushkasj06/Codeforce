import java.util.*;
public class forbidden {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
           
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i=0;i<n;i++){
                    System.out.print(1+" ");
                }
                System.out.println();
            }else{
                if(k==1){
                    System.out.println("NO");
                }else{
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i=0;i<n/2;i++){
                            System.out.print(2+" ");
                        }
                        System.out.println();
                    }else{
                        if(k>=3){
                            System.out.println("YES");
                            System.out.println(n/2);
                            for(int i=0;i<n/2-1;i++){
                                System.out.print(2+" ");
                            }
                            System.out.println(3);
                           
                        }else{
                            System.out.println("NO");
                        }
                    }
                }
            }
            
        }
    }
}
