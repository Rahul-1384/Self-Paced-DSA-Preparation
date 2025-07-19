public class PallindromeString {
    public static void main(String[] args) {
        String str = "abcddscba";
        System.out.println(checkPallindrome(str));
    }
    public static boolean checkPallindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
