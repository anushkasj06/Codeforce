import java.util.*;

public class D_Three_Activities{
    static List<Integer> findMax3(int[] arr){
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(new int[]{arr[i],i});
        }

        list.sort((a,b)->Integer.compare(b[0],a[0]));
        List<Integer> top3 = new ArrayList<>();
        for (int i = 0; i < 3 && i < list.size(); i++) {
            top3.add(list.get(i)[1]);
        }
        return top3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            List<Integer> maxA = findMax3(a);
            List<Integer> maxB = findMax3(b);
            List<Integer> maxC = findMax3(c);

            int ans = 0;

            for (int i : maxA) {
                for (int j : maxB) {
                    for (int k : maxC) {
                        if (i == j || j == k || k == i) continue;
                        ans = Math.max(ans, a[i] + b[j] + c[k]);
                    }
                }
            }

            System.out.println(ans);
        }
    }
    
}