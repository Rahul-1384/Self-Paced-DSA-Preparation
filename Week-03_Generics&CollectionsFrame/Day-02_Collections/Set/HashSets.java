import java.util.HashSet;

public class HashSets{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        set.add(12);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(80));
    }
}