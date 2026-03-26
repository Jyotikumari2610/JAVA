import java.util.*;
public class patterns{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        patterns11(n);
    }
    static void patterns1(int n){
/*     *****
       *****
       *****
       *****
       *****
 */
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns2(int n){
/*  *
    **
    ***
    ****
    *****
    */
     for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
       }
    }
    static void patterns3(int n){
/*  *****
    ****
    ***
    **
    *
    * */
         for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
                
        for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
           System.out.print("*");
         }
         System.out.println();
       } 
    }
    static void patterns4(int n){
/*  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
    static void patterns5(int n){
/*    * * * * * 
     * * * * 
    * * * 
   * * 
  * 
*/
        for(int row=0;row<n;row++){
            int spaces=n-row;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=row;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns6(int n){
 /* *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/
         for(int row=0;row<2*n;row++){
            int formula=0;
            if(row>n){
                formula=2*n-row-1;
            }
            else{
                formula=row;
            }
          for(int col=0;col<=formula;col++){
              System.out.print("* ");
          }
          System.out.println();
        }
    } 
    static void patterns7(int n){
/*       *
        **
       ***
      ****
     *****
*/
        for(int row=0;row<=n;row++){
            int spaces=n-row;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns8(int n){
/*   *****
      ****
       ***
        **
         *
*/
        for(int row=0;row<=n;row++){
            for(int s=0;s<=row;s++){
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns9(int n){
/*   * 
    * * 
   * * * 
  * * * * 
 * * * * * 
*/
        for(int row=0;row<=n;row++){
            int spaces=n-row;
            for(int s=0;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns10(int n){
/*   * * * * *
      * * * *
       * * *
        * *
         *
*/
        for(int i=0;i<=n;i++){
            for(int s=0;s<=i;s++){
                System.out.print(" ");
                }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
                }
              System.out.println();
        }
    }
    static void patterns11(int n){
/*   * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/   
        for(int i=0;i<2*n;i++){
            int space=0;
            if(i>n){
                space=2*n-i-1;
            }else{
                space=i;
            }
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            int star=0;
            if(i>=n){
                star=i-n+1;
            }else{
                star=n-i;
            }
            for(int j=0;j<star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    }
