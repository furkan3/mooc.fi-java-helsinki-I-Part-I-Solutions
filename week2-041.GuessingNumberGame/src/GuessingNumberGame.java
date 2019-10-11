
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessMade=0;
        while (true){
            int guess=reader.nextInt();
            if(guess<numberDrawn){
                guessMade++;
                System.out.println("The number is greater, guesses made: " +guessMade);
        }
            else if (guess>numberDrawn){
                guessMade++;
                System.out.println("The number is lesser, guesses made: " +guessMade);  }
            else {
                System.out.println("Congratulations, your guess is correct!");
                break;  }
        }
        // program your solution here. Do not touch the above lines!
    }
        

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
