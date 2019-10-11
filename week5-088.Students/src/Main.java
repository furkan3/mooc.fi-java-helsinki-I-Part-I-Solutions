
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("name: ");
            String name=scanner.nextLine();
            if(!(name.isEmpty())){
                System.out.print("studentnumber: ");
                String studentNum=scanner.nextLine();
                Student name1=new Student(name, studentNum);
                list.add(name1);
            }
            else{
                for(Student names: list)
                    System.out.println(names);
                    break; }
        }
        System.out.println("Give search term: ");
        String searchTerm=scanner.nextLine();
        System.out.println("Result: ");
        for(Student x: list){
            if(x.getName().contains(searchTerm)){
                System.out.println(x);
            }
        }
    }
}
