public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i=0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i=0;
        while(i<amount){
            System.out.print(" ");
            i++;
        }  
    }

    public static void printTriangle(int size) {
        // 40.2
        int i=0;
        int x=(size-1);
        while(i<x){
            printWhitespaces(x);
            x--;
        }
        while(i<size){
            printStars(i);
            i++;
            System.out.println("\n");
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i=0;
        while(i<height){
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
