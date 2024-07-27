package lang.string.test2;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
        String reversed = new StringBuilder(str).reverse().toString(); //이 toString()이 뭘까?
    }
}
