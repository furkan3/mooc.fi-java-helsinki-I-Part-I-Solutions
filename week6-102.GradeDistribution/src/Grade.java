
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class Grade {
    private ArrayList<Integer> scores;
    private int[] grade;
    private int acceptanceNum=0;
    
    public Grade(){
        scores=new ArrayList<Integer>();
        acceptanceNum=0;
        grade=new int[6];
    }
    public void addScore(int score){
        scores.add(score);
    }
    public void getGrade(){
        for(int i: this.scores ){
            if(i<30)
                grade[0]++;
            else if(i<35){
                grade[1]++;
                acceptanceNum++;
            }
            else if (i<40){
                grade[2]++;
                acceptanceNum++;
            }
            else if (i<45){
                grade[3]++;
                acceptanceNum++;
            }
            else if (i<50){
                grade[4]++;
                acceptanceNum++;
            }
            else{
                grade[5]++;
                acceptanceNum++;
            }
        }
    }
    public void printGrades(){
        System.out.println("Grade distribution:");
        for(int i=5;i>=0;i--){
            System.out.print(i+": ");
            for(int j=0;j<this.grade[i];j++){
                System.out.print("*");
            }
                System.out.println("");              
        }
    }
    public double acceptanceRate(){
        double rate=0;
        if(!(scores.isEmpty())){
        rate=100*acceptanceNum/scores.size();
            }
        return rate;    
    } 
}
