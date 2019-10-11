
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory reformatory=new Reformatory();
        Person brian=new Person("Brian",1,110,7);
        Person pekka=new Person("Pekka",33,176,85);
        
        System.out.println("total weights measured " + reformatory.totalWeightsMeasured());
        
        System.out.println(brian.getName()+ " weight: "+ reformatory.weight(brian)+ " kilos" );
        System.out.println(pekka.getName()+ " weight: "+ reformatory.weight(pekka)+ " kilos" );
        
        reformatory.feed(brian);
        reformatory.feed(brian);
        reformatory.feed(brian);
        
        System.out.println(brian.getName()+ " weight: "+ reformatory.weight(brian)+ " kilos" );
        System.out.println(pekka.getName()+ " weight: "+ reformatory.weight(pekka)+ " kilos" );

        System.out.println("total weights measured "+ reformatory.totalWeightsMeasured());
    }
}
