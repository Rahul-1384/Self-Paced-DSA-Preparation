import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>(5);
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
