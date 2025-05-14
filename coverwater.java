import java.util.*;

public class coverwater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();

            int e =0;
            boolean f = true;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    e++;
                }

                if(i>0 && i<n-1){
                    if(s.charAt(i-1)=='.' && s.charAt(i)=='.' && s.charAt(i+1)=='.'){
                        System.out.println(2);
                        f = false;
                        break;
                        
                    }
                }
                
            }
            if(f){
                System.out.println(e);    
            }

        }
    }
}
