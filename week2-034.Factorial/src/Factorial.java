import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number=reader.nextInt();
        int i=1;
        int x=1;
        while(i<=number){
            x*=i;
            i++;
        }
        System.out.println(x);
    }
}
