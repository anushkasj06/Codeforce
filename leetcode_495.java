public class leetcode_495 {

    public int findPoisonedDuration(int[] timeSeries, int d) {
        int sum = d;
        int temp = timeSeries[0] + d -1;

        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]> temp){
                sum+=d;
            }else{
                sum += timeSeries[i]+d-1-temp;
            }
            temp = timeSeries[i] + d -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        leetcode_495 l = new leetcode_495();
        int[] timeSeries = {
                1,2
        };
        int d = 2;
        System.out.println(l.findPoisonedDuration(timeSeries,d));
    }
}

