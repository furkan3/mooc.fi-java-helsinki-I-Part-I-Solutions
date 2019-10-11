/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit=upperLimit;
        this.value=0;
    }
    public void next(){
        if (this.value<=upperLimit){
            this.value++;
        }
        if (this.value>upperLimit)
            this.value=0;
    }
    
    public String toString(){
        if (this.value<10)
            return ("0"+ value);
        else
            return (""+ value);
    }
    
    public int getValue(){
        this.value=value;
        return value;
    }
    
}
