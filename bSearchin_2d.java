import java.util.*;
public class bSearchin_2d {
  /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        int result[]=search(matrix,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int matrix[][],int target){
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
        */
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();

    }
    Static int[] binarySearch(int m[][],int r,int cstart,int cend,int i){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(m[i][mid]==target){
                return new int[]{i,mid};
            }
            else if(m[i][mid]>target){
                cend=mid-1;
            }
            else{
                cstart=mid+1;
        }
    }
    static int[] bsearch(int m[][],int t){
        int r=m.length;
        int c=m[0].length;
        if(r==1){
            return binarySearch(m,0,0,c-1,t);
            int rstart=0;
            int rend=r-1;
            int cmid=c/2;
            while(rstart<rend-1){
                if(m[rstart][cmid]==t){
                    return new int[]{rstart,cmid};
                }
                else if(m[rstart][cmid]>t){
                    rend=rstart;
                }
                else{
                    rstart=rstart+1;
                }
            }
            if(m[rstart][cmid]==t){
                return new int[]{rstart,cmid};
            }
            else if(m[rstart+1][cmid]==t){
                return new int[]{rstart+1,cmid};
            }
            else if(t<=m[rstart][cmid-1]){
                return binarySearch(matrix,rstart,0,cmid-1,t);
            }
            else if(t>=m[rstart][cmid+1] && t<=m[rstart][c-1]){
                return binarySearch(matrix,rstart,cmid+1,c-1,t);
            }
             else if(t<=m[rstart+1][cmid-1]){
                return binarySearch(matrix,rstart+1,0,cmid-1,t);
            }
             else{
                return binarySearch(matrix,rstart+1,cmid+1,c-1,t);
             }
        }
        return new int[]{-1,-1};

    }
}
