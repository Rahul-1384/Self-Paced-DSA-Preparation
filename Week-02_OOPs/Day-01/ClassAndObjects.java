import java.util.Arrays;


// Class (Template)
class Car{
    String color;
    int speed;

    void drive(){
        System.out.println("Car Driven at " + speed + " km/h");
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        Car ferrari = new Car();    // Instantiated (ferrari Object)
        ferrari.color = "Red";
        ferrari.speed = 300;
        ferrari.drive();
    }
}