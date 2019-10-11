
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(this.day==30){
            if(this.month==12){
                this.month=1;
                this.year++;
                this.day=1;
            }
            else{
                this.day=1;
                this.month++;   }
        }
        else
            this.day++;
    }
    
    public void advance(int daysGiven){
        for(int i=0;i<daysGiven;i++){
            this.advance();
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        MyDate newDate=new MyDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
