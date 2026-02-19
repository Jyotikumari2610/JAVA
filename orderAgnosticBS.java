import java.util.*;
public class orderAgnosticBS {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=orderAgnosticBinarySearch(arr,target);
        System.out.println(result);
    }
    static int orderAgnosticBinarySearch(int arr[],int target){
        int s=0;
        int e=arr.length-1;
//find whether the array is sorted in ascending or descending order
        boolean isAsc=arr[s]<arr[e];

        while (s <= e) {
            int mid=(s+e)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                 if(arr[mid] < target){
                s=mid+1;
            }
            else if(arr[mid] > target){
                e=mid-1;
               }
            }
             else{
                if(arr[mid] < target){
                e=mid-1;
            }
            else if(arr[mid] > target){
                s=mid+1;
            }
        }
    }
        return -1;
}
}
