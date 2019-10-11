public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter=new Counter(24,true);
        counter.decrease();
        System.out.println(counter.getValue());
        counter.decrease(12);
        System.out.println(counter.getValue());
        counter.increase();
        System.out.println(counter.getValue());
        counter.increase(15);
        System.out.println(counter.getValue());
    }
}
