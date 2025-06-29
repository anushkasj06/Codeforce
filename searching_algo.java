import java.util.*;

public class searching_algo {

    private static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int key){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (r-l)/2+l;
            if(arr[mid]== key){
                return mid;
            }else if(arr[mid]> key){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }

    private static void bubblesort(int[] arr){
        for(int i=arr.length;i>=0;i--){
           boolean done = true;
           for(int j=1;j<i;j++){
               if(arr[j]>arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   done = false;
               }
           }
           if(done){
               System.out.printf("Sorted");
               break;
           }
        }

    }

    private static void selectionsort(int[] arr){
        for(int i=arr.length;i>=0;i--){
            int min = arr[i];
            int pos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionsort(int[] a){
        for(int i=0;i<a.length;i++){
            int new_ele = a[i+1];
            int j=i+1;
            while(j>0 && a[j-1]>new_ele){
                a[j] = a[j-1];
                j--;
            }
            a[j] = new_ele;
        }
    }


    private static void quicksort(int[] a, int start, int end){
        int i = start;
        int j = end;
        int pivot = start;
        while(i<j){
            while(a[i]<a[pivot]){
                i++;
            }
            while(a[j]> a[pivot]){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        if (i<end) {
            quicksort(a,j+1,end);
        }
        if(j>start){
            quicksort(a,start,j-1);
        }

    }

    private static void mergesort( int[] a, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergesort(a,start,mid);
            mergesort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }
    private static void merge(int[] a, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(a[i]<a[j]){
                temp[k] = a[i];
                i++;
            }else{
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = a[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k] = a[j];
            j++;
            k++;
        }
        for(int l=0;l<temp.length;l++){
            a[start+l] = temp[l];
        }
        
    } 

    public static void main(String[] args) {
        int[] arr1 = { 4,8,2,6,7,3,11,62,54,21,100};
        int[] arr2 = {2,3,4,5,6,7,8,9,10,12,1,3,18,1,9,20,30};
        int ans1 = linearSearch(arr1,11);
        System.out.println("index where linear search found at: "+ans1);
        int ans2 = binarySearch(arr2,5);
        System.out.println("index where binary search found at: "+ans2);

    }
}
