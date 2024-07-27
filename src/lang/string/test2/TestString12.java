package lang.string.test2;

public class TestString12 {
    public static void main(String[] args) {
        //reverse() 사용
        String str = "You Rim Ko";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
