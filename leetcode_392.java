public class leetcode_392 {
    public static boolean isSubSequence(String s, String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubSequence(s,t));
    }
}
