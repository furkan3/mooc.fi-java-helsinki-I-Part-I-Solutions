
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private String rightGuesses;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
        this.rightGuesses="";
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!(this.word.contains(letter))){
        if(this.guessedLetters.contains(letter)){
        }
        else{
                this.numberOfFaults++;
                this.guessedLetters+=letter;
            }
        }
        else{
            if(!(this.guessedLetters.contains(letter))){
                this.guessedLetters+=letter;                
            }            
            this.rightGuesses+=letter;
        }        
    }

    public String hiddenWord() {
        String finalG="";
        if(this.rightGuesses.isEmpty())
            for(int k=0;k<this.word.length();k++){
                finalG+="_";
            }
        else{
          for(int i=0;i<this.word.length();i++){
            for(int j=0;j<this.rightGuesses.length();j++){
                if(this.rightGuesses.charAt(j)==this.word.charAt(i)){
                    finalG+=(this.word.charAt(i));
                }
                else
                    finalG+="_";
            }
                }
        }
                return finalG;
    }
}
