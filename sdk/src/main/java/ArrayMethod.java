import org.jetbrains.annotations.NotNull;

public class ArrayMethod {
//    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        void printArray( int[] arr){
            for(int x: arr){
                System.out.println(x);
            }
            printArray(arr);
        }
    }
//}
