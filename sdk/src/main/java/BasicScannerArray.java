import java.util.Scanner;

public class BasicScannerArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of entries: ");
        int x = sc.nextInt();

        int[] arr=new int[x];

        for (int i =0; i<x; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The entries are: " );
        for(int ar1 : arr){
            System.out.print(ar1 + " ");
        }
    }















}
