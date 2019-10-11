import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words=new ArrayList<String>();
        while(true){
            String word=reader.nextLine();
            if (word.isEmpty())
                break;
            words.add(word);
        }
        Collections.reverse(words);
        for (String bebeler: words)
            System.out.println(bebeler);
    }
}
