import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength=length;
        this.random=new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password="";
        for(int i=0;i<this.passLength;i++){
            int num=this.random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            password+=symbol;
        }
        return password;
    }
}
