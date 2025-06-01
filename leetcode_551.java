public class leetcode_551 {
    public boolean checkRecord(String s) {
        int totalA =0;
        int ConL=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                totalA++;
            }
            if(s.charAt(i)=='L'){
                count++;
            }else{
                count = 0;
            }
             ConL = Math.max(count, ConL);
        }

        if(totalA <2 && ConL <3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode_551 obj = new leetcode_551();
        System.out.println(obj.checkRecord("PPALLL"));
        System.out.println(obj.checkRecord("PPALLL"));
    }
}
