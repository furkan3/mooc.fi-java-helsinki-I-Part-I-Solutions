
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int x=0;
        if (number1<number2){
            if(number2<number3)
                x=number3;
            if(number2>number3)
                x= number2;
        }
        else if (number1>number2){
            if (number1<number3)
                x= number3;
            if (number1>number3)
                x= number1;
        }
        else 
            x=number1;
        
        return x;
    }
    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
