
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        
        for(int number:array){
            if(!(number==array[array.length-1]))
                System.out.print(number+", ");
            else 
                System.out.println(number);
        }
    }
}
