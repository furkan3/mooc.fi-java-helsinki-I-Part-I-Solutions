import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      NumberStatistics sum=new NumberStatistics();
      NumberStatistics evenSum=new NumberStatistics();
      NumberStatistics oddSum=new NumberStatistics();
      System.out.println("Type numbers: ");
      while(true){
            int num=reader.nextInt();
            if(num!=-1){
                sum.addNumber(num);
                if(num%2==0){
                    evenSum.addNumber(num);
                }
                else{
                    oddSum.addNumber(num);
                }
            }
            else 
                break;
        }
      System.out.println("sum: " + sum.sum());
      System.out.println("even: " + evenSum.sum());
      System.out.println("odd: " + oddSum.sum());
    }
      /*System.out.println("Amount: " + stats.amountOfNumbers());
      System.out.println("sum: " + stats.sum());
      System.out.println("average: " + stats.average());
*/
    }


        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
