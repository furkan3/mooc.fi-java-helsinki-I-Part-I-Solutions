
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);        
        ArrayList<String> words=new ArrayList<String>();
        while(true){
            String word=reader.nextLine();
            if (word.isEmpty())
                break;
            words.add(word);
        }
        Collections.sort(words);
        for (String bebeler: words)
            System.out.println(bebeler);
    }
}
