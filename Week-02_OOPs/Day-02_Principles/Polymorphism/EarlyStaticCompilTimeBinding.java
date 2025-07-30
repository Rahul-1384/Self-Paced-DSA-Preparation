
class Calculator{
    Calculator(int a, int b){
        System.out.println(a+b);
    }

    Calculator(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class EarlyStaticCompilTimeBinding {
    public static void main(String[] args) {
        // Early binding (Which constructor to call is resolved at compile time)
        Calculator obj = new Calculator(2,2);
        Calculator obj2 = new Calculator(2, 10,4);
    }
}
