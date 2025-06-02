public class leetcode_153 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        leetcode_153 obj = new leetcode_153();
        System.out.println(obj.findMin(arr));
        
    }

    public int findMin(int[] arr){       
        int ind = findMinInd(arr);
        if(ind == -1){
            return arr[0];
        }
        return arr[ind];
    }

    int findMinInd(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid <end &&arr[mid]>arr[mid+1] ){
                return mid+1;
            }else if(mid > start && arr[mid]< arr[mid-1] ){
                return mid;
            }else if(arr[mid]>=arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
