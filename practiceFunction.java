import java.util.*;
public class practiceFunction{
   /*  public static int SumDiffMultiDivision(int a, int b){
        int sum=a+b;
        int diff=a-b;
        int multi=a*b;
        float division=(float)a/b;
        System.out.println("Sum of a and b is:"+sum);
        System.out.println("difference of a and b is:"+diff);
        System.out.println("Sum of a and b is:"+multi);
        System.out.println("Sum of a and b is:"+division);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        SumDiffMultiDivision(a,b);
         
    }*/
  /*   publiic static int Even(int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                 System.out.println(i);
        }
    }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Even(n);
}  //Same for odd n natural numbers
  */
/* public static int Factorial(int n){
    int factorial=1;
    for(int i=1;i<=n;i++){
        factorial*=i;
    }
    System.out.println(factorial);
    return 0;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    Factorial(n);
}
    */
  /* public static int Square(int n){
     int sq=0;                //int sq=n*n; 
     for(int i=0;i<=n;i++){   // System.out.println(sq);
        sq=i*i;
     }
     System.out.println(sq);
     return sq;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    Square(n);
} */
 /*public static int Findmax(int a, int b,int c){
    int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }
    System.out.println("The Largest numbers is: "+max);
    return max;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    Findmax(a,b,c);
} */
public static int Countvowels(String str){
    int count=0;
    str=str.toLowerCase();
    for(int i=0;i<str.length();i++){
         char ch=  str.charAt(i);
         if(ch=='a'|| ch=='e'||  ch=='i'|| ch=='o'|| ch=='u'){
            count++;
         }
    }
    System.out.println(count);
    return count;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");
    String str=sc.nextLine();
    Countvowels(str);
} 

}