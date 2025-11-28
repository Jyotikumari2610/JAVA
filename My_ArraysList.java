import java.util.*;
public class My_ArraysList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
      /* list.add(67);
        list.add(45);
        list.add(56);
        list.add(61);
        list.add(69);
        list.add(55);
        list.add(41);
        list.add(33);
        list.add(70);
        list.add(60);
        System.out.println(list.contains(56));  //whether the element is present or not
        list.set(5,77);    //change or update the value of list at index 5
        list.remove(1);  //removing the element at index 1 from list
        System.out.println(list);
        */
    //input from user
    for(int i=0;i<10;i++){
        list.add(sc.nextInt());
    }
  /*for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));//pass index here to get element at that index
    }
        */
    System.out.println(list);
    }
    
}
