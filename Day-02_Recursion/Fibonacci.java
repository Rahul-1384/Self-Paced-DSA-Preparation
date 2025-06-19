import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(fibo(n));
    }

    public static int fibo(int n){
        if(n < 2){
            return n;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        int sum = a + b;
        return sum;
    }
}
