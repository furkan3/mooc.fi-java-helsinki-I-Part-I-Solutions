import java.util.*;

public class Main {

public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] copied = copy(original);

    // change the copied
    copied[0] = 99;

    // print both
    System.out.println( "original: " + Arrays.toString(original));
    System.out.println( "copied: " + Arrays.toString(copied));
    
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));

}
     public static int[] copy(int[] array){  
        int[] a=new int[array.length];
        for(int i=0;i<array.length;i++){
            a[i]=array[i];
        }
        return a;
    }
     
     public static int[] reverseCopy(int[] array){
         int counter=0;
         int[] b =new int[array.length];
         for(int i=array.length-1;i>=0;i--){
             b[i]=array[counter];
             counter++;
                 }
         return b;
     }   
}
