import java.util.*;
public class Pattern{
       public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number:");
       int n=sc.nextInt();
       //Square pattern
      /*  for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
       } */


       //right angled traingle pyramid
      /*  for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       } */

       //inverted right angled traingle pyramid
     /*    for(int i=n;i<=n;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       } */

    /*    for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");//spaces
            }
        for(int j=1;j<=i;j++){
            System.out.print("*");//stars
        }
        System.out.println();
    } */
   //Butterfly pattern
   //upper half
 /*  for(int i=1;i<=n;i++){
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
   }
   //Lower half
   for(int i=n;i>=1;i--){
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
   }
    */
    //solid rhombus
  /*   for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    } */
   //Daimond pattern 
   //upeer_half
   for(int i=0;i<n;i++){
    int spaces=n-i;
    for(int j=0;j<spaces;j++){
        System.out.print(" ");
    }
    int stars=2*i-1;
    for(int j=0;j<stars;j++){
        System.out.print("*");
    }
        System.out.println();
   }
        //lower_half
        for(int i=n;i>1;i--){
    int spaces=n-i;
    for(int j=0;j<spaces;j++){
        System.out.print(" ");
    }
    int stars=2*i-1;
    for(int j=0;j<stars;j++){
        System.out.print("*");
    }
        System.out.println();
   }
    }
}