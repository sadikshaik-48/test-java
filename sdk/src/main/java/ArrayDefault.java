public class ArrayDefault {
    public static void main(String[] args) {
        int[] Number = new int[3];
        double[] decimal = new double[3];
        boolean[] truth = new boolean[4];
        String[] word = new String[3];

        for (int num : Number) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (double dec : decimal) {
            System.out.print(dec + " ");
        }
        System.out.println();

        for (boolean t : truth) {
            System.out.print(t + " ");
        }
        System.out.println();

        for (String w : word) {
            System.out.print(w + " ");
        }
    }
}