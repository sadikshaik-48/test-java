import java.util.Arrays;

public class ArrayMD {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {10, 20, 30, 53, 40},
                {100, 400}
        };
//        matrix[0][3]=5;
//        matrix[1][3]=50;
//        matrix[2][3]=500;
        int len=matrix.length * matrix[0].length;
        System.out.println(len);
//        loop
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

            }
        }
    }