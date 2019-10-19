
import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BirdDatabase db=new BirdDatabase();
        while(true){
          String x=scanner.next();
          if(x.equalsIgnoreCase("Add")){
              System.out.println("Name: ");
              String name=scanner.next();
              System.out.println("Latin Name: ");
              String latinName=scanner.next();
              db.addBird(name, latinName);
          }
          else if (x.equalsIgnoreCase("Observation")){
              System.out.println("What was observed:?");
              String observed=scanner.next();
              db.addObservation(observed);
          }
          else if (x.equalsIgnoreCase("Statistics")){
              db.printBirds();
          }
          else if (x.equalsIgnoreCase("Show")){
              System.out.println("What?");
              String whichBird=scanner.next();
              db.printABird(whichBird);
          }
          else if (x.equalsIgnoreCase("Quit"))
              break;
        }              
    }
}    

