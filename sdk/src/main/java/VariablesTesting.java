public class VariablesTesting {
    public static void main(String[] args) {

//        local variables declaration
//        int var = 10;
//        System.out.println(var);
        Student s1 = new Student();

        s1.age=20;
        s1.name="sadik";
        System.out.println(s1.age);
        System.out.println(s1.name);

    }
}



class Student{
    int age;
    String name;
}
