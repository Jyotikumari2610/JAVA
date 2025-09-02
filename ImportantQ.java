 import java.util.*;
 public class ImportantQ{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

       /*  //sum of n natural numbers

        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural numbers is:"+sum);
        */

      /*  //Sum and difference of n even numbers

        int sumEven=0;
        int diffEven=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sumEven+=i;
                diffEven-=i;
            }
        }
        System.out.println("Sum of "+n+" even numbers is:"+sumEven);
        System.out.println("Difference of "+n+" even numbers is:"+diffEven);
        */

         /*  //Sum and difference of n odd numbers

          int sumOdd=0;
          int diffOdd=0;
          for(int i=0;i<=n;i++){
            if(i%2!=0){
                sumOdd+=i;
                diffOdd-=i;
            }
          }
          System.out.println("Sum of "+n+ "odd natural numbers is:" +sumOdd);
          System.out.println("Difference of "+n+"Ödd natural numbers is:"+diffOdd);
            */

          /*   //fibonacci series

            int f1=0;
            int f2=1;
            for(int i=0;i<n;i++){
               // System.out.println(f1+" ");
                int f=f1+f2;
                f1=f2;
                f2=f;
                System.out.println(f2+" ");
            }
           */

        /*    //factorial of a number

            int factorial=1;
            for(int i=1;i<=n;i++){
                factorial*=i;
            }    
            System.out.println(n+" factorial is:" +factorial);
        */

      /*   //npr combination

        int r=sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;
        }
        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact*=i;
        }
        int npr=nfact/nmrfact;
        System.out.println(n+"P"+r+"="+npr);
        */

        //ncr combination
        int r=sc.nextInt();
        if(r>n){
            System.out.println("Invalid input r cannot be grater tha n");
        }
        long nPr = 1;
        for (int i = 0; i < r; i++) {
            nPr *= (n - i);
        }
        long rFact = 1;
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }

        long nCr = nPr / rFact;

        System.out.println(n + "P" + r + " = " + nPr);
        System.out.println(n + "C" + r + " = " + nCr);

    }
 }