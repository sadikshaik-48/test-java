import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args) {
        double[] dec = {10.4,3.2,78.2,736.32,2382.888,1.4444,82.443234};
        Arrays.sort(dec);
//        for (int i=0; i<dec.length; i++) {
//            System.out.println(dec[i]);
//        }
        for (double d : dec){
            System.out.print(d + " ");
        }
    }
}
