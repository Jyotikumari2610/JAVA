import java.util.*;
public class MultiArrayLst {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialisation
        for(int i=0;i<4;i++){
            list.add(new ArrayList<>());
        }
        //the above  for loop we had  used to add 4 empty arraylists inside the main list

        //add elements
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        //print the list 
        System.out.println(list);
    }
}
