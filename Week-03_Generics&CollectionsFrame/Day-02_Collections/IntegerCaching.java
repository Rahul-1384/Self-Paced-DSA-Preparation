public class IntegerCaching{
    public static void main(String[] args) {
        // Integer Caching (Only for Objects)
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // True bcz in range [-128, 127]

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d); // False bcz out of range and will make new objects of both c & d
    }
}