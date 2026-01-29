public class ArrayEvenOddIndexex {
    public static void main(String[] args) {
        int[] arr = {26,42,3,22,77,65,35,345,65,244,23,334};

        System.out.print("The Even Indexed No. are: ");

        for(int i=0; i<arr.length; i += 2){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("The Odd Indexed No. are: ");

        for (int i=1; i<arr.length; i += 2){
            System.out.print(arr[i] + " ");
        }
    }
}
