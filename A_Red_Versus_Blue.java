import java.util.Scanner;

public class A_Red_Versus_Blue {
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int b = scanner.nextInt();

        int nred= r / (b + 1);
        int rem= r % (b + 1);

        StringBuilder result = new StringBuilder();

        for(int i=0;i<b;i++){
            for(int j=0;j<nred; j++){
                result.append("R");
            
            }

            if(rem>0){
                result.append("R");
                rem--;
            }
            result.append("B");

        }

        for(int i=0;i<nred;i++){
            result.append("R");
        }

        System.out.println(result.toString());        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        
        while (testcases-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}
