
public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money sum=new Money(this.euros+added.euros, this.cents+added.cents);
        return sum;
    }
    public boolean less(Money compared){
       if (this.euros<compared.euros){
           return true;
       }
       else if (this.euros==compared.euros){
           if(this.cents<compared.cents){
               return true;
           }
       }
        return false;
    }
    
    public int euroToCents(int euro,int cents){
        return euro*100+cents;
    }
    public Money minus(Money decremented){
        int totalCents=euroToCents(this.euros, this.cents)-euroToCents(decremented.euros, decremented.cents);
        Money minus=new Money(totalCents/100,totalCents%100);
        Money zeroCents=new Money(0,0);
        if(totalCents>0){        
        return minus;}
        else
            return zeroCents;            
    }
}
