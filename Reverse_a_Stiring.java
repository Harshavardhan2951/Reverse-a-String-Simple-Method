import java.util.Scanner;

public class Reverse_a_Stiring {
    public static void main(String[] args) {
        // Generate a Input using Scanner Class
        Scanner sc = new Scanner(System.in);
        // Create an Input String and Empty String >-- for adding the characters 
        String Name = sc.next(), Reversestr = "";
        char ch;
        System.out.printf("The INPUT strin is : %s", Name);
        System.out.println();
        // We have to Iterate the String 
        for(int i=0; i<Name.length(); i++) {
            ch = Name.charAt(i);
            Reversestr = ch + Reversestr;
        }
        System.out.println("The Reversed String is : "+Reversestr);
    }
}
