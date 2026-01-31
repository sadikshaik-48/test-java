import java.util.Scanner;

class Counter{
    static int count;
}

public class ScannerStaticVariable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Counter.count=sc.nextInt();
        System.out.println(Counter.count);
        sc.close();
    }
}
