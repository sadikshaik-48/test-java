import java.util.Scanner;

public class Names {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        if (n < 1 || n > 100) return;

        boolean found = false;

        for (int i = 0; i < n; i++) {
            String names = sc.nextLine();

            if (names.equals("mike")) {
                found = true;
            }
        }
        if (found) {
            System.out.println("mike");
        }
        else {
            System.out.println("name not found");
        }
    }

}

