/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Bird {
    private String name;
    private String latinName;
    private int observeCount;
    
    public Bird(String name,String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observeCount=0;
    }
    
    public void addBird(String name,String latinName){
        this.name=name;
        this.latinName=latinName;
        this.observeCount=0;
    }
    public void observation(){
        this.observeCount++;
    }
    public void printStatistics(){
        System.out.println(this.name+"("+this.latinName+"): "+this.observeCount+" observations");
    }
    public String getName(){
        return this.name;
    }
    
}
