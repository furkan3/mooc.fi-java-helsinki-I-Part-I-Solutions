
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String deneme="";
        for(int i=0;i<text.length();i++){
            char a=text.charAt(text.length()-i-1);
            deneme=deneme+a;
        }
            
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return deneme;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
