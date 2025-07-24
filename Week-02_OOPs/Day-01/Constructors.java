
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
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Copy Constructor (Copies the data from another object)
    Student(Student s){
        rno = s.rno;
        name = s.name;
        marks = s.marks;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(20, "Rahul", 50);  // Parameterized Constructor
        Student s2 = new Student(); // Default Constructor
        Student s3 = new Student(s1);   // Copy Constructor
        // Object 1
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        // Object 2
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        // Object 3
        System.out.println(s3.rno);
        System.out.println(s3.name);
        System.out.println(s3.marks);
    }
}
