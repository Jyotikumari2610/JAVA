public class numberPattern {
    public static void main(String args[]){
        int n=8;
      /*  for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            } 
            System.out.println();    
      } */
      /*for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
     } */
    /*   int number=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
      } */
   /* *  for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){
                System.out.print("0 ");
            }
            else {
                System.out.print("1 ");
            }
            }
            System.out.println();
        } */
      /*  for(int i=0;i<=n;i++){
        for(int j=0;j<2-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print(i+" ");
        }
        System.out.println();
       } */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
        for( int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
     }
     
    }
}
    
