
class Student{
    // Instance Variables / Class Variables
    int rno;
    String name;
    int marks;

    // Constructor Parameters
    Student(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // 'this' refers to the current object - the objects whose constructor is being called

    // Why use 'this'?
    // Instance variable's and constructor parameters have same name.
    // To avoid conflict between them we use this.
}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Rahul", 90);
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}
