
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x=reader.nextInt();
        System.out.println("Type another number: ");
        int y=reader.nextInt();
        int bigger=Math.max(x, y);
        System.out.println("The bigger number of the two numbers given was: "+ bigger);
        // Implement your program here. Remember to ask the input from user
    }
}
