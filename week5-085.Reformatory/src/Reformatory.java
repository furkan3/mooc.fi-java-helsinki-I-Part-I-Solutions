public class Reformatory {
    private int measureAmount=0;
   
    public int weight(Person person) {      
        measureAmount++;
        return (person.getWeight());       
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return measureAmount;
    }
}
