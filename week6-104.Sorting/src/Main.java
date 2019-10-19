import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr={21,10,3,17,11,14};
        System.out.println("smallest: "+ smallest(arr));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(arr));
        System.out.println(indexOfTheSmallestStartingFrom(arr,1));
        swap(arr, 1, 0);
        System.out.println( Arrays.toString(arr) );
        sort(arr);
    }
    
    public static int smallest (int[] array) {
    int smallest=array[0];
    for(int value: array){
        if (smallest>value){
            smallest=value;
                }
            }
    return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==smallest(array)){
                index=i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int minIndex=index;
        for(int i=minIndex+1;i<array.length;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[] array){
        for(int j=0;j<array.length;j++){
            swap(array, j, indexOfTheSmallestStartingFrom(array, j));
        }
        System.out.println(Arrays.toString(array));
    }

}
