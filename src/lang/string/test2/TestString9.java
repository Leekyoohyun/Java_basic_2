package lang.string.test2;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] hello = email.split("@");

        System.out.println("ID: "+hello[0]);
        System.out.println("Domain: "+hello[1]);
    }
}
