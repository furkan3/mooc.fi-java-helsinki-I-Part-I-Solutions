import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while(true){
        System.out.println("Double?: ");
        double number=Double.parseDouble(reader.nextLine());
        if(number<40 && number>-30)
            Graph.addNumber(number);
        }
        // Graph is used as follows:
    }
}
