import java.util.Scanner;



public class VariablesMix {
    public static void main(String[] args) {
        Mango s= new Mango();

        Scanner sc=new Scanner(System.in);

        s.name=sc.nextLine();

        s.marks=sc.nextInt();

        System.out.println("marks: " + s.marks);
        System.out.println("name: " + s.name);
        System.out.println("Name of the school : " + Mango.Schoolname);
        sc.close();
    }
}
class Mango {
    String name;
    int marks;
    static String Schoolname="ABC School";
}