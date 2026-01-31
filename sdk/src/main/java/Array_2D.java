public class Array_2D {
    public static void main(String[] args) {

        String[][] things = {{"pen", "pencil", "earaser"},
                            {"car", "bike", "cycle"},
                            {"mobile", "tablet", "laptop"}};

        things[1][2] = "lorry";
//        loop for this 2d array.
        for(int i=0; i<things.length; i++) {
            for(int j=0; j<things[i].length; j++) {
                System.out.print(things[i][j] + " ");

            }
            System.out.println();

        }
    }
}
