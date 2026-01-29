import java.util.Arrays;

public class Arrays_4 {
    public static void main(String[] args) {
        String[] name= {"prakash","aman","harish","sirish","raghav"};

//        for filling the elements with our desired element.
        Arrays.fill(name, "SADIK");

//        to print elements
        for (int i=0; i<name.length; i++) {
            System.out.println(name[i]);
        }

    }
}
