
class Student{
    int rno;
    String name;
    int marks;
    Student(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

public class Final {
    public static void main(String[] args) {
        // Always initialize final variable with declaration
        // For primitives final don't let reassign the values
        final int a = 10;
        // a = 11;  // Compile time error


        // For Objects final don't let change the reference, but let change the internal data
        final Student s1 = new Student(20, "Rahul", 90);
        // s1 = new Student(10, "Yashvi", 100); // Error
        s1.name = "Yashvi";

    }
}
