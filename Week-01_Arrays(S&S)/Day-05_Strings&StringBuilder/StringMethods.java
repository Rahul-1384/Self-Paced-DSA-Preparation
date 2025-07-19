import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Rahul Rajput";

        // String to character Array
        char[] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));

        // Gives the index value of character
        System.out.println(name.indexOf('R'));

        // Removes trailins white spaces from start and last
        System.out.println(name.trim());

        // gives string [0, n) where n is exclusive
        System.out.println(name.substring(0, 12));

        // Splits a string into arrays of substring on basis
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(String.valueOf(0));

    }
}
