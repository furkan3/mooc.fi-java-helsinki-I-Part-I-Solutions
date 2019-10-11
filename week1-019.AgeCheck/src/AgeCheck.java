
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int x=reader.nextInt();
        if (x<=120 && x>=0)
            System.out.println("OK");
        else 
            System.out.println("Impossible!");
    }
}
