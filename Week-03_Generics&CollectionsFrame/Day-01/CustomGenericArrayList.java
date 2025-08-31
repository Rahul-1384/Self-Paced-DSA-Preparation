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

    public static int minimizeCleaningCost(String dataset, int matchCost, int mismatchCost) {
        int n = dataset.length();
        char[] chars = dataset.toCharArray();
        
        int[][] dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        
        for (int len = 2; len <= n; len += 2) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                
                for (int k = i + 1; k <= j; k += 1) {
                    int pairCost = (chars[i] == chars[k]) ? matchCost : mismatchCost;
                    
                    int leftCost = 0;
                    int rightCost = 0;
                    
                    if (i + 1 <= k - 1) {
                        leftCost = dp[i + 1][k - 1];
                    }
                    
                    if (k + 1 <= j) {
                        rightCost = dp[k + 1][j];
                    }
                    
                    if (leftCost != Integer.MAX_VALUE && rightCost != Integer.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i][j], pairCost + leftCost + rightCost);
                    }
                }
            }
        }
        
        return dp[0][n - 1];
    }
}
