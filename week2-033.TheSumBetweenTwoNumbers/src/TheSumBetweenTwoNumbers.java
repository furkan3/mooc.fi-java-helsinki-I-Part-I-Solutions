
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first=reader.nextInt();
        int second=reader.nextInt();
        int i=0;
        while(first<=second){
            i+=first;
            first++;

        }
        System.out.println(i);
    }
}
