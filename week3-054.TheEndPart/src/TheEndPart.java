import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String name=reader.nextLine();
        System.out.println("length of end part: ");
        int length=reader.nextInt();
        System.out.println("Result: "+ name.substring(name.length()-length,name.length()));        
    }
}
