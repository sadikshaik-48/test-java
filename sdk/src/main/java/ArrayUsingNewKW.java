public class ArrayUsingNewKW {
    public static void main(String[] args) {

//        here we declared the size of an array.
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 9;
        arr[2] = 4;
        System.out.println(arr.length);
        System.out.println("For checking the all elements in the array");
//        for (int i=0; i<arr.length; i++)
        for (int x:arr)
        {
            System.out.print(x + " ");
//            System.out.print(arr[i] + " ");
        }
    }
}
