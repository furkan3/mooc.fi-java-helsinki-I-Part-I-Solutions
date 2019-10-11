
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int i=0;
        int sum=0;
        
        while(i<=number){
            sum+=i;
            i++;
        }
        
     System.out.println(sum);

    }
}
