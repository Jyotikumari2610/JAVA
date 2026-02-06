import java.util.*;
public class NQues {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
      /*   System.out.println("Even digit in "+n+" is:");
        int even=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit%2==0){
                even++;
            }
        }
        System.out.print(even);
        */
        /* System.out.println("Odd digit in "+n+" is:");
        int odd=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit%2!=0){
                odd++;
            }
        }
        System.out.print(odd);
        */
      /* System.out.println("Zero in "+n+" is:");
        int zero=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==0){
                zero++;
            }
        }
        System.out.println(zero);
        */
       /* int d=sc.nextInt();
        System.out.println(+d+" in "+n+ " is:");
        int count=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==d){
                count++;
            }
        }
        System.out.println(count);
        */
      /* System.out.println("Largest digit in "+n+" is:");
        int LDig=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit>LDig){
              LDig=digit;
            // if(digit<=9 && digit>=0){
               // LDig++;
             }
            }
            System.out.println(LDig);
            */
    /*System.out.println("Smallest digit in "+n+" is:");
        int SDig=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
           // if(digit<SDig){
            //  SDig=digit;
            if(digit>=9 && digit<=0){
               SDig++;
             }
            }
            System.out.println(SDig);
            */
           int rev=0;
            while(n>0){
                int digit=n%10;
                rev=rev*10+digit;
                n=n/10;
            }
            System.out.println("Reversed digit:"+rev);
            

        }
    }
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
    }
}


