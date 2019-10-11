/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Counter {
    private int startingValue;
    private boolean check;
    
    public Counter(int cstartingValue,boolean ccheck){
        this.startingValue=cstartingValue;
        this.check=ccheck;
    }
    
    public Counter(int cstartingValue){
        this.startingValue=cstartingValue;
        this.check=false;
    }
    
    public Counter(boolean ccheck){
        this.check=ccheck;
        this.startingValue=0;
    }
    
    public Counter(){
        this.startingValue=0;
        this.check=false;
    }
    
    public int value(){
        return this.startingValue;
    }
    
    public void increase(){
        this.startingValue++;
    }
    public void increase(int increaseAmount){
        if(increaseAmount>0)
            this.startingValue+=increaseAmount;
    }
    
    public void decrease(){
        if(this.check && this.startingValue<1){
        }
        else 
            this.startingValue--;
    }
    public void decrease(int decreaseAmount){
        if(decreaseAmount>0){
            if(this.check && this.startingValue<decreaseAmount){
                this.startingValue=0;
             } 
            else
                this.startingValue-=decreaseAmount;
        }   
    }
    
    public int getValue(){
        return this.startingValue;
    }
}
