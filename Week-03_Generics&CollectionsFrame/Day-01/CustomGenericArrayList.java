import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }
    private boolean isFull(){
        return size == DEFAULT_SIZE;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get(int idx){
        return (T)data[idx];
    }

    public void set(int idx, T value){
        data[idx] = value;
    }

    public void remove(){
        size--;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }


    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list);

    }
}
