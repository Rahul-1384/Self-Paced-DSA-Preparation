
class Student{
    int rno;
    String name;
    int marks;
    static String college = "GLA University";

    Student(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    static void showCollege(){
        System.out.println(college);
    }
    void display(){
        System.out.println(name);
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", 70);
        Student s2 = new Student(2, "Yashvi", 80);

        // Needed to create an object s1 & s2 to call non-static method in sstatic method
        s1.display();
        s2.display();

        // Can call static method without creating an object
        Student.showCollege();
    }
}
