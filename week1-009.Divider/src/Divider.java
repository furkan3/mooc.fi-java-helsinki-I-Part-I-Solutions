
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a =reader.nextInt();
        System.out.println("Type another number: ");
        int b =reader.nextInt();
        
        System.out.println("Division: "+ a+"/"+b + "="+ 1.0*a/b);
        
        // Implement your program here. Remember to ask the input from user.
    }
}
