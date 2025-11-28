import java.util.*;
public class ArrayQ {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
   /*      System.out.println("Swapping of array elements is:");
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(i+1<n){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            } 
            System.out.print(arr[i]+" ");      
        }
            */
        /*    System.out.println("Maximum elements in array:");
            int max=0;
            for(int i=0;i<n;i++){
                if(max<arr[i])
                max=arr[i];
            }
            System.out.println("Maximum elements:"+max);
            */
           /*  System.out.println("Maximum range in array:");
            int maxRange=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]>maxRange){
                    maxRange=arr[i];
                }
            }
            System.out.println(maxRange);
            */
            System.out.println("reverse of an array:");
            int rev=0;
            for(int i=n-1;i>=0;i--){
                rev=arr[i];
                System.out.println("Revesed array:"+rev);
            }
            }
    }

