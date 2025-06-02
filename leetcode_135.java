public class leetcode_135 {
    public static void main(String[] args) {
        leetcode_135 obj = new leetcode_135();
        int[] rating = {1,0,2};
        System.out.println(obj.candy(rating));
    }

     public int candy(int[] rating) {
        int[] candies = new int[rating.length];
        int n = rating.length;
        for(int i=0;i<rating.length;i++){
            candies[i]= 1;
        }
        int sum =0;
        for(int i=1;i<n;i++){
            if(rating[i-1]<rating[i]){
                candies[i]= candies[i-1]+1;
            }
        }

        for(int i=n-1;i>0;i--){
            if(rating[i-1]>rating[i]  && candies[i-1]<=candies[i]){
                candies[i-1] = candies[i]+1;
            }
        }

        for(int i=0;i<candies.length;i++){
            sum += candies[i];
        }
        return sum;
    
    }
}
