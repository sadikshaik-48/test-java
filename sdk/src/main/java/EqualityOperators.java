public class EqualityOperators {
    public static void main(String[] args) {
        System.out.println('a' == 'a');
        System.out.println(10 == 20);
        System.out.println("Sadik" == "Sadik");
        String s=new String("Sadik");


        System.out.println();
        //        For checking the Objects

        System.out.println("For checking  the objects");

        Object o= new Object();
        Thread t= new Thread();
        System.out.println(t == o);
        System.out.println(o == t);
        System.out.println(s == o);
//        System.out.println(s == t);
    }
}
