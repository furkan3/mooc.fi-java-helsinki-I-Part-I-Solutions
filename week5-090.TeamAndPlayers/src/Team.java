/**
 *
 * @author Furkan
 */
import java.util.*;

public class Team {
    private String name;
    private ArrayList<Player> list;
    private int maxSizeTeam=16;
    
    public Team(String name){
        this.name=name;
        this.list=new ArrayList<Player>();
    }
    
    public String getName(){
        return this.name;
    }                      
    
    public void addPlayer(Player player){
        if(!(this.size()==this.maxSizeTeam))
        this.list.add(player);
    }

    public void printPlayers(){
        for(Player players: this.list)
            System.out.println(players);
    }
    
    public void setMaxSize(int maxSize){
        this.maxSizeTeam=maxSize;
    }
    
    public int size(){
        int counter=0;
        for(int i=0;i<list.size();i++)
            counter++;
        return counter;
    }
    
    public int goals(){
        int goals=0;
        for (Player players: this.list)
            goals+=players.goals();
        return goals;
    }
    
}
