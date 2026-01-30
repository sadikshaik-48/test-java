public class VarArgMethods {
    public static void m1(int...a){
        System.out.println("var arg methods:" + a.length);
    }

    public static void main(String[] args) {
        m1();
        m1(1,2,3,4,4,5,5,6,6,4,3);
        m1(10,20,30);
    }
}
