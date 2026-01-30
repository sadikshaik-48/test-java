import java.util.Scanner;

public class TestingFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yn= sc.next();
        if(yn.equalsIgnoreCase("yes")){
            System.out.println("Accepted");
        }
        else
            System.out.println("Rejected");

        sc.close();
    }
}
