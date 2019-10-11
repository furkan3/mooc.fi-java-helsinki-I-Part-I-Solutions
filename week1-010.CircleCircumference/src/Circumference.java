
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int radius=reader.nextInt();
        double cevre=radius*2*Math.PI;
        System.out.println("Circumference of the circle: "+cevre);
        
        // Program your solution here 
    }
}
