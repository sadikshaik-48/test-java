import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] revarr = {10, 3, 6, 2, 4, 7, 5, 9, 1, 8};
        Arrays.sort(revarr);
//        loop
        for (int rev : revarr) {
            System.out.print(rev + " ");
        }
    }
}
