import java.util.*;

public class C_Double_ended_Strings{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String a = in.next();
            String b = in.next();
            long n = a.length();
            long m = b.length();
            long op = n+m;
            for(int len=1;len<=Math.min(n,m);len++){
                for(int i=0;i+len<=n;i++){
                    for(int j=0;j+len<=m;j++){
                        if(a.substring(i,i+len).equals(b.substring(j, j+len))){
                            op = Math.min(op, n+m-2*len);
                        }
                    }
                }
            }
            System.out.println(op);
        }
    }
}