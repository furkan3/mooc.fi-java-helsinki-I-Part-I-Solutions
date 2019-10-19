/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
import java.util.ArrayList;
public class BirdDatabase {
    private ArrayList<Bird> bd;
    
    public BirdDatabase(){
        bd=new ArrayList<Bird>();
    }
    public void addBird(String name,String latinName){
        Bird b=new Bird(name,latinName);
        bd.add(b);
    }
    public void addObservation(String name){
        for(Bird birds: bd){
            if(birds.getName().equalsIgnoreCase(name))
                birds.observation();
        }
    }
    public void printBirds(){
        for(Bird bird:bd){
            bird.printStatistics();
        }
    }
    public void printABird(String name){
        for(Bird bird:bd){
            if(bird.getName().equalsIgnoreCase(name))
                bird.printStatistics();
        }
    }
}
