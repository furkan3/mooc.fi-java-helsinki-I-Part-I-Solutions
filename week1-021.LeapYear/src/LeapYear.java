
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int x=reader.nextInt();
        if (x%4==0){
            if (x%100==0 && x%400!=0)
                System.out.println("The year is not a leap year.");
            else if (x%100!=0 && x%400==0)
                System.out.println("The year is a leap year.");
            else 
                System.out.println("The year is a leap year.");}
        else
            System.out.println("The year is not a leap year.");
    }
}
