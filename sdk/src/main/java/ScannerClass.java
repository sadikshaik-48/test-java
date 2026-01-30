import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int x = sc.nextInt();
//        int b = x *10;
//        System.out.println("product of " + x + "*10 is " + b);
//        boolean Issadik=sc.nextBoolean();
//        System.out.println(Issadik);



//        System.out.println("Continue if the statement is true? ");
//        boolean choice = sc.nextBoolean();
//
//        if (choice) {
//            System.out.println("Continuing...");
//        } else {
//            System.out.println("Stopping...");
//        }



//        if (sc.hasNextBoolean()) {
//            boolean val = sc.nextBoolean();
////            System.out.println(val);
//        } else {
//            System.out.println("Please enter true or false only");
//
//       }
        System.out.println("Are u a human");
        boolean student=sc.nextBoolean();

         if(student){
             System.out.println("You are allowed");
         }
         else {
             System.out.println("You are not allowed");
         }


    }
}
