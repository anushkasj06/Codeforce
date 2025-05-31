public class leetcode_1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
           freq[c-'a']++;
        }

        int val = 0;
        for(int i=0;i<26;i++){
            if(val==0 && freq[i]!=0){
                val = freq[i];
                break;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=val && freq[i]!=0){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        leetcode_1941 obj = new leetcode_1941();
        String s = "aaabb";
        System.out.println(obj.areOccurrencesEqual(s));
        
    }
}
