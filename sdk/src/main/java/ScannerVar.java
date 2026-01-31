import java.util.Scanner;

public class ScannerVar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Person p=new Person();
       p.age=sc.nextInt();
               System.out.println("age= " + p.age);
    }
}
class Person {
    int age;
}
