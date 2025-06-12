import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Equal_Subsequences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder s = new StringBuilder();
            for(int i=0;i<k;i++){
                s.append('1');
            }
            for(int i=0;i<n-k;i++){
                s.append('0');
            }
            System.out.println(s);
            

        }
    }
}