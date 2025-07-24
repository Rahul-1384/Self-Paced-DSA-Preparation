
class Student{
    int rno;
    String name;
    int marks;

    // Default Constructor
    Student(){
        rno = 10;
        name = "Rahul";
        marks = 50;
    }

    // Parameterized constructor
    Student(int rno, String name, int marks){
        rno = rno;
        name = name;
        marks = marks;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(20, "Rahul", 50);
        Student s2 = new Student();
        // Object 1
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        // Object 2
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);
    }
}
