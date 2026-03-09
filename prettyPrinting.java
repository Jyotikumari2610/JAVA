public class prettyPrinting {
    public static void main(String args[]){
        //% is the place holder
        //%d for integer
        //%f for float
        //%s for string
        //%c for character
        //%u for unsigned integer
        //%o for octal
        //%X for hexadecimal
        //%n for new line
        //%% for percentage
        //%t for date and time
        //%e for scientific notation
        //%g for general format
        //%a for hexadecimal floating point
        float a=453.8975f;
        System.out.printf("Formatted number is %.3f",a);//it will print the number with 3 decimal places
        System.out.println("\nValue of pi is " + Math.PI);
        System.out.printf("Value of pi is %.2f",Math.PI);//it will print the value of pi with 2 decimal places
        System.out.printf("\nHello my name is %s and I am %s.","Jyoti","a student");//it will print the string with the placeholders replaced by the provided values
        System.out.printf("\nMy age is %d and my height is %.2f cm.",25,5.8f);//it will print the integer and float with the placeholders replaced by the provided values
        System.out.printf("%o is the octal representation of %d.",10,8);//it will print the octal representation of 10 and the decimal representation of 8
        System.out.printf("\n%X is the hexadecimal representation of %d.",255,255);//it will print the hexadecimal representation of 255 and the decimal representation of 255
        System.out.printf("\n%% is used to print percentage symbol.");//it will print the percentage symbol 
        System.out.printf("\nScientific notation of %f is %e.",a,a);//it will print the scientific notation of the float variable a
        System.out.printf("\nGeneral format of %f is %g.",a,a);//it will print the general format of the float variable a
        System.out.printf("\nHexadecimal floating point of %f is %a.",a,a);//it will print the hexadecimal floating point representation of the float variable a
        
    }
}
