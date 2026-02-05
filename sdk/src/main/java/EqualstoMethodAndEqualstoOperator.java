public class EqualstoMethodAndEqualstoOperator {
    public static void main(String[] args) {
        String s1 = new String("Sadik");
        String s2 = new String("Sadik");
        System.out.println(s1 == s2);
//        ( == ) used for address or reference comp.
        System.out.println(s1.equals(s2));
//        .equals() used to check the content similarities.
    }
}
