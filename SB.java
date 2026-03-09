import java.util.Arrays;

public class SB {
    public static void main(String args[]){
      /*StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch).append(" ");
        }
        System.out.println(builder.toString());
        */
       String name="Jyoti Kumari";
       System.out.println(Arrays.toString(name.toCharArray()));//it will convert the string into a character array 
       //it will return the hash code of the string object
       System.out.println(name.hashCode());       //it will return the hash code of the string object

    }
}