import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>(5);
        List<Integer> list2 = Collections.synchronizedList(new ArrayList<>());
        list.add(2);
        list.add(4);
        list.add(6);
        for(int num : list){
            System.out.println(num);
        }

        list.remove(2);
        System.out.println(list.size());
    }
}
