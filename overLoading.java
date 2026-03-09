public class overLoading {
    public static void main(String args[]){
      /* System.out.println('a'+'b');//it will print the sum of the ASCII values of 'a' and 'b'
        System.out.println("a"+"b");//it will concatenate the two strings "a" and "b" 
        System.out.println('a'+"b");//it will concatenate the character 'a' with the string "b" 
        System.out.println((char)('a'+'b'));//it will print the character representation of the sum of the ASCII values of 'a' and 'b'
        System.out.println((char)('a'+3));//it will print the character representation of the sum of the ASCII value of 'a' and 3
      //  System.out.println("Jyoti"+ new ArrayList<>());//it will concatenate the string "Jyoti" with the string representation of the empty ArrayList object, which is "[]"
        System.out.println("Astuti"+new int[]{1,2,3});//it will concatenate the string "Astuti" with the string representation of the array object, which is something like "[I@15db9742" 
        System.out.println("Astuti"+'a');//it will concatenate the string "Astuti" with the character 'a'
*/
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.print(ch+" ");
            series+=ch+" ";
        }
        System.out.println(series);
    }
}
