import java.util.*;
public class practiceArrayL {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Create an ArrayList of integers and add 5 elements
  /*      ArrayList<Integer> jks=new ArrayList<Integer>();
        System.out.println("Enter elements in lists:");
        for(int i=0;i<5;i++){
            jks.add(sc.nextInt());
        }
     /*    System.out.println("The elements in the lists are: ");
        System.out.println(jks);
        */
       //Print all elements of an ArrayList using a loop.
     /*   for(int i=0;i<jks.size();i++){
        System.out.print(jks.get(i)+" ");
       }
        */
   /*   // Insert an element at a specific index in an ArrayList.
        System.out.println("Enter index and element to be inserted:");
         int index=sc.nextInt();
         int  element=sc.nextInt();
            jks.add(index,element);
            System.out.println("Updated list after insertion:");
            System.out.println(jks);
*/
      /*  //Remove an element from an ArrayList by index.
        System.out.println("Enter index of element to be removed:");
        int index=sc.nextInt();
        jks.remove(index);
        System.out.print("Updated lists are: "+jks);
        */

 /*   //Size of an ArrayList
      System.out.println("Size of the ArrayLists is: "+jks.size());
*/
 /*   //Check if an element exists in an ArrayList.
      boolean m=jks.contains(45);
      System.out.println(m);
      */

   /*   //Replace an element at a specific index (using set()).
        jks.set(3,86);
        System.out.println("Updated ArrayLists "+jks);
        */
    /*   // Get an element from an ArrayList using get().
        int elem=jks.get(2);
        System.out.println("Element at index 2 is: "+elem);
*/
    //String ArrayList
    ArrayList <String> str=new ArrayList<String>();
    System.out.println("Enter 5 strings:");
    for(int i=0;i<5;i++){
        str.add(sc.nextLine());
    }
  /*  System.out.println("The strings in the ArrayList are:"+str);
    //Remove an element by value (e.g., remove "Apple" from a list of fruits).
    System.out.println("Enter string to be removed:");
    str.remove(4);
    System.out.println("Updated strings in the ArrayList are:"+str);
*/
//Create an ArrayList of strings and print it in reverse order.
System.out.println("Reverse order of String ArrayLists: ");
    for(int i=str.size()-1;i>=0;i--){
        String rev=str.get(i);
        System.out.print(rev);
    }
    }
}
