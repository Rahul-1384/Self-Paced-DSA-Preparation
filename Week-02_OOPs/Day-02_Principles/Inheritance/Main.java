// Parent class
class Box {
    int l;
    int w;
    int h;

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public Box(int l, int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(Box obj){
        this.l = obj.l;
        this.w = obj.w;
        this.h = obj.h;
    }
}

// Child class
class BoxWeight extends Box {
    int weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(int l, int w, int h, int weight){
        super(l, w, h); // Super is used to access the constructor of parent class.
        this.weight = weight;
    }
    public BoxWeight(BoxWeight obj){
        this.l = obj.l;
        this.w = obj.w;
        this.h = obj.h;
        this.weight = obj.weight;
    }
}


public class Main {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(2,3,4,5);
        System.out.println(box.w);

        Box obj1 = new BoxWeight(20,30,40,50);
        System.out.println(obj1.l);
    }
}
