
class Student{
    int rno;
    String name;
    int marks;

    Student(){
        // rno = 1;
        // name = "Rahul";
        // marks = 70;

        this(1, "Rahul", 70);
        System.out.println("Constructor 1 is called.");
    }

    Student(String name){
        // rno = 2;
        // this.name = name;
        // marks = 80;

        this(2, name, 80);
        System.out.println("Constructor 2 is called.");

    }
    Student(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student rahul = new Student();
        Student yashvi = new Student("Yashvi");
        Student manish = new Student(3, "Manish", 100);
        // Rahul
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        // Yashvi
        System.out.println(yashvi.rno);
        System.out.println(yashvi.name);
        System.out.println(yashvi.marks);

        // Manish
        System.out.println(manish.rno);
        System.out.println(manish.name);
        System.out.println(manish.marks);

    }
}
