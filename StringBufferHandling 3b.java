import java.util.Scanner;

public class StringBufferHandling {
    public static void main (String[] args){
        // Task i: Checking capacity of StringBuffer objects
        StringBuffer sb1= new StringBuffer();
        System.out.println("Capacity of sb1: "+ sb1.capacity());

        StringBuffer sb2= new StringBuffer();
        System.out.println("Capacity of sb2: "+ sb2.capacity());

        // Task ii: Reversing the contents of string and converting to uppercase
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string");
        String inputString=scanner.nextLine();

        StringBuffer reversed = new StringBuffer(inputString);
        reversed.reverse();
        String revuppercase=reversed.toString().toUpperCase(); //Converts the StringBuffer back to a String, then uppercase
        System.out.println("Reversed string in uppercase: " + revuppercase);

        // Task iii: Reading a string from console and appending it
        System.out.print("Enter a string to append: ");
        String appendString=scanner.nextLine();
        reversed.append(appendString);
        System.out.println("String after appending: " + reversed);

        scanner.close();
    }
}
