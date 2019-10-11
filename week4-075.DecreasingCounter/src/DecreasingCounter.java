public class DecreasingCounter {
    private int value;
    private int firstValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.firstValue=valueAtStart;
    }
    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(!(value<1)){
            this.value--;
        }
    }
    
    public void reset(){
        this.value=0;
    }
    // and here the rest of the methods
    public void setInitial(){
        this.value=this.firstValue;
    }
}
