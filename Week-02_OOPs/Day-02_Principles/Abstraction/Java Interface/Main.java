import java.lang.reflect.Member;

interface Engine{
    
    // Implicitly b is public static final
    int b = 10;
    public static final int a = 10;

    // Cannot create constructor because instance of interfaces cannot be created
    // Engine(int b){
    //     this.b = b;
    // }

    // Can only be abstract methods till Java 7
    // Below 3 methods are public abstract by default
    void start();
    void stop();
    void acc();

    // Can have default and dstatic methods after Java 8+
    static void sound(){
        System.out.println("Sound is roar type");
    }
}
interface Brake{
    void brake();
}
interface Media{
    void start();
    void stop();
}



class Car implements Engine, Brake, Media{
    public void start(){
        System.out.println("Start the car");
    }

    public void stop(){
        System.out.println("Stops the car");
    }

    public void acc(){
        System.out.println("Accelerate the car");
    }
    
    public void brake(){
        System.out.println("Apply brakes");
    }
}

public class Main{
    public static void main(String[] args) {
        // Cannot instantiate Interfaces
        // Engine engine = new Engine();
        Car obj = new Car();
        obj.start();
        obj.stop();
        obj.acc();
        obj.brake();
        Engine.sound();
    }
}
