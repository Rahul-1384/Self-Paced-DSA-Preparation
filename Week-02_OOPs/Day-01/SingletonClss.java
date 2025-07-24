
class Student{
    private Student(){

    }

    private static Student instance;

    public static Student getInstance(){
        if(instance == null){
            instance = new Student();
        }

        return instance;
    }
}

public class SingletonClss {
    public static void main(String[] args) {
        Student obj1 = Student.getInstance();

        Student obj2 = Student.getInstance();
        System.out.println(obj1 == obj2); // true (same object)

    }
}
