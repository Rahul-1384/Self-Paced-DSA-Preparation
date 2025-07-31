import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == DEFAULT_SIZE;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public void remove(){
        size--;
    }

    public int size(){
        return size;
    }

    public void set(int idx, int value){
        data[idx] = value;
    }

    public int get(int idx){
        return data[idx];
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list);
        System.out.println(list.size());
        // But the problem with Custom ArrayList is that we can 
        // only insert int values not string, char, float type.
        // In order to achieve this we use Generics.
    }
}
