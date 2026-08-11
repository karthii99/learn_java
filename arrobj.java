class Student {
    String name;
    int age;
    int marks;
}

public class arrobj {
    public static void main(String[] args) {

        Student[] students = new Student[3];//it creates an arr to store the object reference

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "Karthik";
        students[0].age = 20;
        students[0].marks = 85;

        students[1].name = "Rahul";
        students[1].age = 21;
        students[1].marks = 90;

        students[2].name = "Arun";
        students[2].age = 19;
        students[2].marks = 75;

        System.out.println(students[0].name);
        System.out.println(students[1].name);
        System.out.println(students[2].name);
    }
}