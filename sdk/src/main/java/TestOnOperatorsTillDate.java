import java.util.Scanner;

public class TestOnOperatorsTillDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person.");
        String name = sc.nextLine();
        System.out.println(name + " Is a java developer");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("true");
        }
        else if(a == b){
            System.out.println("Both the No's. are equal");
        }
        else {
            System.out.println("false");
        }

        System.out.println("The Sum of the a & b: " + a  + b);
        System.out.println("The diff is: " + (a - b));
        System.out.println("The Product of the a & b: " + a * b);
        sc.close();
    }
}
