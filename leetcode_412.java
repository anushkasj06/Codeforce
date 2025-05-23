import java.util.List;
import java.util.ArrayList;

public class leetcode_412 {
    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        for (String str : result) {
            System.out.println(str);
        }
       
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
  
}
