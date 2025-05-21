import java.util.List;
import java.util.ArrayList;

public class leetcode_401 {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int turnedOn = 1;
        leetcode_401 solution = new leetcode_401();
        List<String> result = solution.readBinaryWatch(turnedOn);
        System.out.println(result);
        // Example output: ["0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00"]
    }
}
