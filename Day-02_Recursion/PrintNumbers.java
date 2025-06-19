// public class PrintNumbers {
//     public static void main(String[] args) {
//         int n = 1;

//         print1(n);
//     }
//     public static void print1(int n){
//         System.out.println(1);
//         print2(2);
//     }

//     public static void print2(int n){
//         System.out.println(2);
//         print3(3);
//     }

//     public static void print3(int n){
//         System.out.println(3);
//         print4(4);
//     }

//     public static void print4(int n){
//         System.out.println(4);
//         print5(5);
//     }

//     public static void print5(int n){
//         System.out.println(5);
//     }
// }


public class PrintNumbers {
    public static void main(String[] args) {
        int n = 1;

        print(n);
    }

    public static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        print(n + 1);
        System.out.println(n);
    }
}