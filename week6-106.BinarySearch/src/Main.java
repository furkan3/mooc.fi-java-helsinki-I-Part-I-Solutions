
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner lukija = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        boolean bool = BinarySearch.search(array, Integer.parseInt(etsittavaLuku));
        if(bool){
            System.out.println("Value "+ etsittavaLuku+" is in the array");
        }
        else 
            System.out.println("Value "+ etsittavaLuku+" is not in the array");
        // Print here the result
    }
}
