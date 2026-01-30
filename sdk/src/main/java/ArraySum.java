public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
            System.out.println("Sum = " + count);
        }
        
    }
