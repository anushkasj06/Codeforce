import java.util.*;


public class leetcode_599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int indexSum = map.get(list2[i]) + i;
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(list2[i]);
                } else if (indexSum == minIndexSum) {
                    result.add(list2[i]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        leetcode_599 solution = new leetcode_599();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = solution.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result)); // Output: ["Shogun"]
    }
}
