import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String rv="";
        for (int i=text.length();i>=1;i--){
            rv=rv+text.charAt(i-1);
        }
        if (rv.equals(text))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
