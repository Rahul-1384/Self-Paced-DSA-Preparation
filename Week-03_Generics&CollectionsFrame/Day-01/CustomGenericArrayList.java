import java.util.Arrays;

public class CustomGenericArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenericArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == DEFAULT_SIZE;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public void remove(){
        size--;
    }

    public T get(int idx){
        return (T)data[idx];
    }

    public int size(){
        return size;
    }

    public void set(int idx, T value){
        data[idx] = value;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(2);
        list.add(4);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
