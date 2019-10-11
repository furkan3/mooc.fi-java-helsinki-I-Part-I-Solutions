import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Name: ");
        String name=reader.nextLine();
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(name.length()-i-1));
        }
        System.out.println(" ");

    }
}
