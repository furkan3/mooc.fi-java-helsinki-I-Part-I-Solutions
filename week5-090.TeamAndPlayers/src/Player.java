/**
 *
 * @author Furkan
 */
public class Player {
    private String name;
    private int numberOfGoals;
    
    public Player(String name){
        this.name=name;
        this.numberOfGoals=0;
    }
    public Player(String name,int goals){
        this.name=name;
        this.numberOfGoals=goals;
    }
    
    public String getName(){
        return this.name;
    }
    public int goals(){
        return this.numberOfGoals;
    }
    
    public String toString(){
        return this.name+", goals "+this.numberOfGoals;
    }
    
}
