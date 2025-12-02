import java.util.*;
public class binarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);   
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Enter element to be searched:");
        int x=sc.nextInt();
        int s=0;
        int e=n-1;
        boolean found = false;

        while (s <= e) {
            int mid=(s+e)/2;
            if(arr[mid] == x){
                System.out.println("Element found:"+mid);
                found = true;
                break;
            }
            else if(arr[mid] < x){
                s=mid+1;
            }
            else{
                e=mid-1;
            }   
        }
         if (!found) {
            System.out.println("Element not found.");
         }
    }
}
