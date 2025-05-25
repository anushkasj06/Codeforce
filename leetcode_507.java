
public class leetcode_507 {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28)); // true
        System.out.println(checkPerfectNumber(6));  // true
        System.out.println(checkPerfectNumber(12)); // false
        System.out.println(checkPerfectNumber(496)); // true
        System.out.println(checkPerfectNumber(8128)); // true
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;
    }
}