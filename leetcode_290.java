import java.util.*;


public class leetcode_290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(!set.contains(c)){

                set.add(c);
                if(map.containsKey(c)){
                    return false;
                }
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(c, words[i]);
            }else{
                if(!map.get(c).equals(words[i])){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
